SUMMARY = "Python bindings to FreeDesktoporg Secret Service API"
DESCRIPTION = "This module provides a way for securely storing passwords and other secrets. \
 \
It uses D-Bus `Secret Service`_ API that is supported by GNOME Keyring \
(since version 2.30) and KSecretsService. \
 \
The main classes provided are ``secretstorage.Item``, representing a secret \
item (that has a *label*, a *secret* and some *attributes*) and \
``secretstorage.Collection``, a place items are stored in. \
 \
SecretStorage supports most of the functions provided by Secret Service, \
including creating and deleting items and collections, editing items, \
locking and unlocking collections (asynchronous unlocking is also supported). \
 \
The documentation can be found on `pythonhosted.org`_. \
 \
.. _`Secret Service`: https://specifications.freedesktop.org/secret-service/ \
.. _`pythonhosted.org`: https://pythonhosted.org/SecretStorage/"
LICENSE = "BSD-3-Clause"

PV = "3.3.3"

RPM_NAME = "python311-SecretStorage-3.3.3-4.2.noarch.rpm"
RPM_HASH = "03bcd85a38d2c78fcdf7620a7d3f06788fe77e62168609bcaf1cb77c68e60db6cbce8f1ba5bfe5078dc22d78f33c6cbf17d65529381e2877571d8072f7229a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SecretStorage \
python3.11dist-secretstorage \
python311-SecretStorage \
python3dist-secretstorage"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-jeepney"

inherit rpm

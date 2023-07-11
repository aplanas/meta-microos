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

RPM_NAME = "python39-SecretStorage-3.3.3-4.2.noarch.rpm"
RPM_HASH = "d29b207973d323dbda475e8ced9c2776a9c1c8db6f4c353307acff392f5904135a8239267d20278c09a600a88fa646764bc478afa206308f5b7f771dbe3228ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-secretstorage \
python39-SecretStorage \
python3dist-secretstorage"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-jeepney"

inherit rpm

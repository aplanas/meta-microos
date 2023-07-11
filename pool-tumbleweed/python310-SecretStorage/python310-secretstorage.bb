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

RPM_NAME = "python310-SecretStorage-3.3.3-4.2.noarch.rpm"
RPM_HASH = "30aff8cac7199ade4313c9f8c6519b19f3f80a417b961c9a85ba7aaa37159689267160157b3126669b240b60d3ebc1967ffd73ced0a1e68cdbcf553757bbbe28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-secretstorage \
python310-SecretStorage \
python3dist-secretstorage"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-jeepney"

inherit rpm

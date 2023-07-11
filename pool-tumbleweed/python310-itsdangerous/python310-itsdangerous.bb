SUMMARY = "Various helpers to pass trusted data to untrusted environments and back"
DESCRIPTION = "It's Dangerous \
   ... so better sign this \
 \
Various helpers to pass data to untrusted environments and to get it back \
safe and sound. \
 \
This repository provides a module that is a port of the django signing \
module.  It's not directly copied but some changes were applied to \
make it work better on its own. \
 \
Also I plan to add some extra things.  Work in progress."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python310-itsdangerous-2.1.2-2.3.noarch.rpm"
RPM_HASH = "eeacc092a1598c37916fbca486209460a1e875c164184d85a159654c22350258e1bbb95610e780cb46176eee5ee377329c4c30bd25a75889114a59cc71cf2dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-itsdangerous \
python310-itsdangerous \
python3dist-itsdangerous"

RDEPENDS:${PN} += "python-abi"

inherit rpm

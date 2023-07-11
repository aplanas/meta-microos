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

RPM_NAME = "python311-itsdangerous-2.1.2-2.3.noarch.rpm"
RPM_HASH = "56e5ae4ddfd1e8e5e6b81f2bc9ba2777c6fdf9dfed483d8d18567c9ca8295addd4dcbcd13c7a2cc4bff73026864d59629ab89b7f313093c5173760c9b4033e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itsdangerous \
python3.11dist-itsdangerous \
python311-itsdangerous \
python3dist-itsdangerous"

RDEPENDS:${PN} += "python-abi"

inherit rpm

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

RPM_NAME = "python39-itsdangerous-2.1.2-2.3.noarch.rpm"
RPM_HASH = "fc7ba20ced06e39b85e954557754e2285ca3fbad7c0c21aded30d9f5c78a1db266a05e878eaba2b33a2ed3bbd8de44145e0a30ceeac49b6944c97853f33eecfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-itsdangerous \
python39-itsdangerous \
python3dist-itsdangerous"

RDEPENDS:${PN} += "python-abi"

inherit rpm

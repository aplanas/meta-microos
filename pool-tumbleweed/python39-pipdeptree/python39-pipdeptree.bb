SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python39-pipdeptree-2.7.1-1.1.noarch.rpm"
RPM_HASH = "2123bda579797432d021ff38817abf8093deebc2186f5a8a177eb1da23f65b171f9d8a1b7296ff6dd4629d9e3fb47688b22afe7680f2be8ff6efd4b84b9c2482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pipdeptree \
python39-pipdeptree \
python3dist-pipdeptree"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pip \
update-alternatives"

inherit rpm

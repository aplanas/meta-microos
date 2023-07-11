SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-pathable-0.4.3-4.3.noarch.rpm"
RPM_HASH = "191154d815026c8cc8aabbf4716e91c364ff3cc6a87fe5c051da83c00e698de397ad8da0423f68c56ea2b32f5826c932727d6d2a632f821e89566f648e61cde1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictpath \
python3-pathable \
python3.11dist-pathable \
python311-dictpath \
python311-pathable \
python3dist-pathable"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.0"

RPM_NAME = "python310-nose2-0.12.0-2.1.noarch.rpm"
RPM_HASH = "3029ba198f7aefca8e77efe45c44725a5c3cea00d6045693e9b45f98e7f667eb3d2d35a7c25c8329a60034d1e035089dc8fdde7714297cb716a87ae115475db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nose2 \
python3.10dist-nose2 \
python310-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

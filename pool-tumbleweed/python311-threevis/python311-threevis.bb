SUMMARY = "Plugin for visualizing geometry in a Jupyter Notebook"
DESCRIPTION = "A plugin for visualizing meshes, point clouds, and other geometry in \
a Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.post25"

RPM_NAME = "python311-threevis-0.1.0.post25-6.4.noarch.rpm"
RPM_HASH = "7af17624ee8b2643190c124befc9144af6ab0b2efa7754f6457c396afe38b41af5c996144c048618e980a1cd556505943a662ed27df19b33ab3ea980da6d28e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-threevis \
python3.11dist-threevis \
python311-threevis \
python3dist-threevis"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-openmesh \
python311-pythreejs"

inherit rpm

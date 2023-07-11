SUMMARY = "Plugin for visualizing geometry in a Jupyter Notebook"
DESCRIPTION = "A plugin for visualizing meshes, point clouds, and other geometry in \
a Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.post25"

RPM_NAME = "python39-threevis-0.1.0.post25-6.4.noarch.rpm"
RPM_HASH = "ee7937d8057221fe521a621e3eb9edacbe2a335042435cb48a8ec2a0b04317db6d69ba8e35456974f25974b1006c8795cf03f0e4d5ba942c6ecc2d40d58dedd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-threevis \
python39-threevis \
python3dist-threevis"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-openmesh \
python39-pythreejs"

inherit rpm

SUMMARY = "Plugin for visualizing geometry in a Jupyter Notebook"
DESCRIPTION = "A plugin for visualizing meshes, point clouds, and other geometry in \
a Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.post25"

RPM_NAME = "python310-threevis-0.1.0.post25-6.4.noarch.rpm"
RPM_HASH = "c4a638b9870d25449513f9c8b6bc2e62b66374b6317272a564e0348ad406342d56007e20072725df580b69ad9b1f0218f1499d07bc3504646b40af3789efab6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-threevis \
python310-threevis \
python3dist-threevis"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-openmesh \
python310-pythreejs"

inherit rpm

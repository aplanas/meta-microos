SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "python39-ndtiff-1.12.0-1.3.noarch.rpm"
RPM_HASH = "b99de779baaa81333ae7a9107f6c6baad07d340d978ec3d2537d953823102f875c8d7b69cca48d7aec7c5f55e8850ecff4c9820ca49dd39fc9c8d97c9302b4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ndtiff \
python39-ndtiff \
python3dist-ndtiff"

RDEPENDS:${PN} += "python-abi \
python39-dask-array \
python39-numpy"

inherit rpm

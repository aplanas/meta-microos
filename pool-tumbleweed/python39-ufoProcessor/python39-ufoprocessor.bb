SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python39-ufoProcessor-1.9.0-3.10.noarch.rpm"
RPM_HASH = "d73233a4a66eba691ed27c19f2754741526756e68cf6dcbd20bbab71785f5e0994a6f934d47f2dba8d926356c169e18ecef31dfe5c84b89bcb96d9e16d3a8245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ufoprocessor \
python39-ufoProcessor \
python3dist-ufoprocessor"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-defcon \
python39-fontMath \
python39-fontParts \
python39-fontPens \
python39-lxml \
python39-mutatorMath \
python39-unicodedata2"

inherit rpm

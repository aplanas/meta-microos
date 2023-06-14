SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-ufoProcessor-1.9.0-3.8.noarch.rpm"
RPM_HASH = "2442bd0df641c8512adf4dd1153ff2efc2f2ce607f1454bf423afd98efebbea917e8087e34b10d4aa1268615aa87e4cf27d521c0a2c9bb149efbf4ebaa5b53ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufoProcessor \
python3.10dist-ufoprocessor \
python310-ufoProcessor \
python3dist-ufoprocessor"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-defcon \
python310-fontMath \
python310-fontParts \
python310-fontPens \
python310-lxml \
python310-mutatorMath \
python310-unicodedata2"

inherit rpm

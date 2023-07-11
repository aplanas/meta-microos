SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-ufoProcessor-1.9.0-3.10.noarch.rpm"
RPM_HASH = "edb1bd32332725ee3a8247177dc77616172571ba70e299c5cd5f1ff020b078a8a13f644ac5be8d6b0b05c9671c9490a347f938051da7f2aee961dcc9556dc0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ufoprocessor \
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

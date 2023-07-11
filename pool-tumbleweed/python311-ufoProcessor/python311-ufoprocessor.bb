SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-ufoProcessor-1.9.0-3.10.noarch.rpm"
RPM_HASH = "d967c93435d2c890b6875856faadd6ac025fb24d6a56a9cfc91982a8239e1ff1d7e172536ed1f2455daed679e3b4b519956195005c73bc2905a607ecb6e01b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufoProcessor \
python3.11dist-ufoprocessor \
python311-ufoProcessor \
python3dist-ufoprocessor"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-defcon \
python311-fontMath \
python311-fontParts \
python311-fontPens \
python311-lxml \
python311-mutatorMath \
python311-unicodedata2"

inherit rpm

SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-ufoProcessor-1.9.0-3.8.noarch.rpm"
RPM_HASH = "28e752c5d9e1ad8b081060016e303194992014bf756f89270fa60bc1d24c73719fc27dc29f0c513e03fc7e72f5cea188ff1717ed5cb4fc2d9c828aa2fa40fae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ufoprocessor) \
python311-ufoProcessor \
python3dist(ufoprocessor)"

RDEPENDS:${PN} += "python(abi) \
python311-FontTools \
python311-defcon \
python311-fontMath \
python311-fontParts \
python311-fontPens \
python311-lxml \
python311-mutatorMath \
python311-unicodedata2"

inherit rpm

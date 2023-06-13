SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python39-ufoProcessor-1.9.0-3.8.noarch.rpm"
RPM_HASH = "b1033af9665d12a9ab33fa5b3f5befe3c84c3abc0a533e405082fcbb56cc4ddcc2f82b6aae7be16ac567dac15407387a14b7b1d888dfdeda1e38f26c88b7bcc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ufoprocessor) \
python39-ufoProcessor \
python3dist(ufoprocessor)"

RDEPENDS:${PN} += "python(abi) \
python39-FontTools \
python39-defcon \
python39-fontMath \
python39-fontParts \
python39-fontPens \
python39-lxml \
python39-mutatorMath \
python39-unicodedata2"

inherit rpm

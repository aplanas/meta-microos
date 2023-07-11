SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-specfile-0.18.0-1.3.noarch.rpm"
RPM_HASH = "8cabb59c4abdfcc7d84bde2f8ac34198c4ff53c9b4ffef1fecf37a63430d01bb0782b73602b53882badddc0c0968dac27161b9a7bba5717ecc45230ab455b8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-specfile \
python39-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python39-rpm"

inherit rpm

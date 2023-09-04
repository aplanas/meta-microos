SUMMARY = "Python FFI toolkit using clang"
DESCRIPTION = "Python FFI toolkit using clang."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "python3-ctypeslib2-2.3.4-2.1.noarch.rpm"
RPM_HASH = "99feb407de3d59f015fc176c70fb91289ef6c6863776bc16af256136832ddb51bda290ed81358283d5b210c09427b0f2b9fcde74690094b77b0447b1c9b19aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ctypeslib2 \
python3.11dist-ctypeslib2 \
python311-ctypeslib2 \
python3dist-ctypeslib2"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-clang15 \
update-alternatives"

inherit rpm

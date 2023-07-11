SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-misaka-2.1.1-2.19.aarch64.rpm"
RPM_HASH = "59ee8ef254112b494e7049033b93723a0bbfee5dc635f65bbf652d85aedcde6a5bfe3112d8c1efcc3667830f74e56181c4ea1d18a426ecf24c4d3c23dc919422"

RPROVIDES:${PN} += "python3-misaka \
python3.11dist-misaka \
python311-misaka \
python3dist-misaka"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi \
update-alternatives"

inherit rpm

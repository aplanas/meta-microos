SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.16.4"

RPM_NAME = "python311-pywlroots-0.16.4-1.2.aarch64.rpm"
RPM_HASH = "4452a66a4c278bc538e5e253ee8bdc0e4f7c5a8bfba15cf278c3aedcbc06fe118b9acb215ac23098d3d7519486d57866aba938e30f161215eba6515d98d68023"

RPROVIDES:${PN} += "python3-pywlroots \
python3.11dist-pywlroots \
python311-pywlroots \
python3dist-pywlroots"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwlroots.so.11 \
python-abi \
python311-pywayland \
python311-xkbcommon"

inherit rpm

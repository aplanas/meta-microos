SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "python311-pymilter-1.0.4-3.12.aarch64.rpm"
RPM_HASH = "6ae03c898f682bd1f6ee6ea9146822cdb1ce06dc182cf60270995061b76ffcb491a65fbaa0df29eed97458cbe35583e1014a5d4a26a4a4bfbdd3d9f610fadb00"

RPROVIDES:${PN} += "python3.11dist(pymilter) \
python311-pymilter \
python311-pymilter(aarch-64) \
python3dist(pymilter)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmilter.so.1.0()(64bit) \
pymilter-common \
python(abi) \
python311 \
python311-py3dns"

inherit rpm

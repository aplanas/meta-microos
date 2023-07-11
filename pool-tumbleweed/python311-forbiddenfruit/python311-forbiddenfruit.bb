SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.3"

RPM_NAME = "python311-forbiddenfruit-0.1.3-2.19.aarch64.rpm"
RPM_HASH = "0c5d8d114307f3693f6b8e9530553ffccf70314e5f213530cff73c8e9785716a0451c4dcf0ea6eecb30e324433dd62532f0313058ad8b01ec45bb524a57496cb"

RPROVIDES:${PN} += "python3-forbiddenfruit \
python3.11dist-forbiddenfruit \
python311-forbiddenfruit \
python3dist-forbiddenfruit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

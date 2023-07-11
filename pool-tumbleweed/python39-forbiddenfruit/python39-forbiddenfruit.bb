SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.3"

RPM_NAME = "python39-forbiddenfruit-0.1.3-2.19.aarch64.rpm"
RPM_HASH = "d5debfd7d14d04d5b6f2aed9a1c53c9201422fea31b18b1c954abc64fb54a3386f23523e7d8f29d79d1fdcb68ce8e22c06d183911f4696bd04e690fce7dcabc3"

RPROVIDES:${PN} += "python3.9dist-forbiddenfruit \
python39-forbiddenfruit \
python3dist-forbiddenfruit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

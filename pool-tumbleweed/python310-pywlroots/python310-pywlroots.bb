SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.16.4"

RPM_NAME = "python310-pywlroots-0.16.4-1.2.aarch64.rpm"
RPM_HASH = "fc0e5c1d11747b41d29e5583db6ebee17dc3670ab5743542b9653d66de7160d30e9752165365f61c122c76e04c6498e6ed49db6f8c73bab03f6ba9da64f61885"

RPROVIDES:${PN} += "python3.10dist-pywlroots \
python310-pywlroots \
python3dist-pywlroots"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwlroots.so.11 \
python-abi \
python310-pywayland \
python310-xkbcommon"

inherit rpm

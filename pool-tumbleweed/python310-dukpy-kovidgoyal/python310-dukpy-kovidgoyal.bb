SUMMARY = "JavaScript in Python"
DESCRIPTION = "DukPy is a JavaScript runtime environment for Python using the duktape \
embeddable JavaScript engine. With dukpy, you can run JavaScript in \
Python."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python310-dukpy-kovidgoyal-0.3-3.11.aarch64.rpm"
RPM_HASH = "eb16541615cb4c9b951e491f293e2dafd9951ec51127f293ca26c23e398a99bd32bd28759c8e8aeaf6a45b656da41fa41db81540e56fbe34c9c5af0868882060"

RPROVIDES:${PN} += "python3-dukpy-kovidgoyal \
python3.10dist(dukpy) \
python310-dukpy-kovidgoyal \
python310-dukpy-kovidgoyal(aarch-64) \
python3dist(dukpy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm

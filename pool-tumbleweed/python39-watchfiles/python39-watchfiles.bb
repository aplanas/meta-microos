SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python39-watchfiles-0.19.0-1.1.aarch64.rpm"
RPM_HASH = "f1c153aa401b3b7aa8cce5d3193f3b4dc884c7060f3e811127070d36ad4e95d60e83d7e018d626cfa6db2f1859e34c481a5cac1daa70177840ad76adc5e23e90"

RPROVIDES:${PN} += "python3.9dist(watchfiles) \
python39-watchfiles \
python39-watchfiles(aarch-64) \
python3dist(watchfiles)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi) \
python39-anyio \
update-alternatives"

inherit rpm

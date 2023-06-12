SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python311-watchfiles-0.19.0-1.1.aarch64.rpm"
RPM_HASH = "e6a1d03c969a86e75d54f3c73d7cc41894fb3f87d5e4412f8ee0e4198c986b5dc13b04b1fb1dd91ad809878c21cf4f3cfe19cb77ca4b4b5020eed315c42dcbe7"

RPROVIDES:${PN} += "python3.11dist(watchfiles) \
python311-watchfiles \
python311-watchfiles(aarch-64) \
python3dist(watchfiles)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi) \
python311-anyio \
update-alternatives"

inherit rpm
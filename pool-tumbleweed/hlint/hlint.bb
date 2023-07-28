SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "hlint-3.5-1.11.aarch64.rpm"
RPM_HASH = "f54202cc69920ebec5e5db3396a246053aeb1547cb9bfb5f7448771d51c6cfd6cca15c110a376fbd915bc1db3c6ef457e3da5b88ef8901be61ed861d38638861"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm

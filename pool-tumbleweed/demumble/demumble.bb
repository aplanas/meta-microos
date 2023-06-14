SUMMARY = "A better c++filt and a better undname.exe, in one binary"
DESCRIPTION = "demumble demangles both Itanium and Visual Studio symbols. It runs on both POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "demumble-1.2.2-1.13.aarch64.rpm"
RPM_HASH = "297883715f937e3148a3ddc0b54a0d47c8c77248fb9a279dc0e388fe5497371059c0cda960bd8802940d0417ecd2f81468f69d7a42a6a688c2c6ce56a47a84dc"

RPROVIDES:${PN} += "demumble"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

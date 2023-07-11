SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-hpc-devel-1.82.0-1.4.aarch64.rpm"
RPM_HASH = "c930b05870118ab9fe73ef417c150c051667d1e9cfc0be0453c17d956a983822a9f4614d53ba25d02f43804471b809b6c4800d9a54e4f16e0abb41061f580219"

RPROVIDES:${PN} += "boost-1-82-0-gnu-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm

SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mvapich2-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "5b089860020f65d943a173fa6cd28a716f386c9dd03f83d224c9ccd0aaa5ac3ce8ca17d547c84c6d1a241cc8a59c0106c0641b4fa867c5524e86140973bb4c04"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

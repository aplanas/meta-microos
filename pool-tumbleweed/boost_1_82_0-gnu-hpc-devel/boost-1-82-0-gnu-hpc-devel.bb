SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-hpc-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "51d8f5c1f2bf3eb05142904d52921ad91d9254b40014254109f3028542a05290227c39b0a64bee4d1fd40e79211b23566160e14f5521e961eee6d07003f407b0"

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

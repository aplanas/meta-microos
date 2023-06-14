SUMMARY = "Shared library of konkretcmpi"
DESCRIPTION = "This package contains the shared libkonkretcmpi library."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "libkonkretcmpi0-0.9.2-14.3.aarch64.rpm"
RPM_HASH = "ae363251314a7f56a06d06299379104e08e9573fe15704da250e3e4bec57ce27ea812e70b5258eb076672611e80328ad8cbaf99895f06062f1f7cfee4e7723b4"

RPROVIDES:${PN} += "konkretcmpi \
libkonkret.so.0 \
libkonkretcmpi0 \
libkonkretmof.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

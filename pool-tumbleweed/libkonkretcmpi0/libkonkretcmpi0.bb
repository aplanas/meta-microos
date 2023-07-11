SUMMARY = "Shared library of konkretcmpi"
DESCRIPTION = "This package contains the shared libkonkretcmpi library."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "libkonkretcmpi0-0.9.2-14.4.aarch64.rpm"
RPM_HASH = "56c72f96005971def6d7af64592e72eae211544759c46b9fff965396eb08c98ce706efdd166352f2fc0a6ac4404baf0a953512ad4781b8400cba389a874361ad"

RPROVIDES:${PN} += "konkretcmpi \
libkonkret.so.0 \
libkonkretcmpi0 \
libkonkretmof.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

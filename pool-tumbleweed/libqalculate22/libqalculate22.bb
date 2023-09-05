SUMMARY = "Calulator Library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This is the shared library package."
LICENSE = "GPL-2.0-or-later"

PV = "4.8.0"

RPM_NAME = "libqalculate22-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "e9ad4024eb52249e024869381b76bc56ffb4546676660c0291732ee414d9d34606acd769df089f295dc2b9d26091fd344047d8a9c6123852bb0cff875b5d5473"

RPROVIDES:${PN} += "libqalculate \
libqalculate.so.22 \
libqalculate22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgmp.so.10 \
libicuuc.so.73 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm

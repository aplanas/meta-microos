SUMMARY = "Calulator Library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This is the shared library package."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "libqalculate22-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "0770be5574e9a352ca2ced76ed506bcfce3ab572d15666f57879e9230b8c491be0d7f182da85f4989be758b13768a51ba9e00b9b7f77820880ca8f9d807bbf56"

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

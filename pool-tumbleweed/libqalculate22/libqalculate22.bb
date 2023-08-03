SUMMARY = "Calulator Library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This is the shared library package."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.0"

RPM_NAME = "libqalculate22-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "728b65924a0e5c7a5c9f9b76bc95eb9c1378b7f7d1f5377b6490dafe8194b6a9d0f87e4b58aba6550926aae884574368a08ae0b7b3a534ee94271101e944c560"

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

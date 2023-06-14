SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use. \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsnd6-6_0-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "87363b6a3588db7e4e42f1d31ecbff71379e344335be07f97e38fd051a6929089de0bba50e8297f7a29950391c783b28999aed4aa88dc0d049ec8111bd3bc67a"

RPROVIDES:${PN} += "libcsnd6-6-0 \
libcsnd6.so.6.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcsound64.so.6.0 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm

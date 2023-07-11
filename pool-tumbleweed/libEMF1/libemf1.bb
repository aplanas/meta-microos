SUMMARY = "Library for manipulation with Enhanced MetaFile (EMF, ECMA-234)"
DESCRIPTION = "LibEMF is a C/C++ library which provides a drawing toolkit based on \
ECMA-234. The general purpose of this library is to create vector \
graphics files on POSIX systems which can be imported into \
StarOffice/OpenOffice. The Enhanced MetaFile (EMF) is one of the two \
color vector graphics format which is 'vectorially' understood by \
SO/OO. The EMF format also has the additional advantage that it can be \
'broken' into its constituent components and edited like any other \
SO/OO graphics object."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.13"

RPM_NAME = "libEMF1-1.0.13-3.4.aarch64.rpm"
RPM_HASH = "6c817c90d6c2d35c1f3744a88aa0e99dcf7c842b15f4d4c9439fdd7fdbfae37127b792c160c503f6f478ceed342412bd5ef51944635118f9d4c51447963f3c76"

RPROVIDES:${PN} += "libEMF.so.1 \
libEMF1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

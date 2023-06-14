SUMMARY = "Library for manipulation with Enhanced MetaFile (EMF, ECMA-234)"
DESCRIPTION = "LibEMF is a C/C++ library which provides a drawing toolkit based on \
ECMA-234. The general purpose of this library is to create vector \
graphics files on POSIX systems which can be imported into \
StarOffice/OpenOffice. The Enhanced MetaFile (EMF) is one of the two \
color vector graphics format which is 'vectorially' understood by \
SO/OO. The EMF format also has the additional advantage that it can be \
'broken' into its constituent components and edited like any other \
SO/OO graphics object."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.0.13"

RPM_NAME = "libEMF-devel-1.0.13-3.3.aarch64.rpm"
RPM_HASH = "ab84332c140cb455b04e83b9222cc37e39767e99f47ca329f95eb01884d893f950b14d371db7339c526d41b28284afabfff1818963e39d032534a20a01b2a484"

RPROVIDES:${PN} += "libEMF-devel"

RDEPENDS:${PN} += "glibc-devel \
libEMF1"

inherit rpm

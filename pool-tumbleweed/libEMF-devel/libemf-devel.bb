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

RPM_NAME = "libEMF-devel-1.0.13-3.4.aarch64.rpm"
RPM_HASH = "3aba60e90d58fe6aafc13cb345cd0640736cd4b5ec2a7ec784f96fd62ef69f393be77cac63c9fc295e69324dfb46123196ad3fe95e2954c04cde4443c488870b"

RPROVIDES:${PN} += "libEMF-devel"

RDEPENDS:${PN} += "glibc-devel \
libEMF1"

inherit rpm

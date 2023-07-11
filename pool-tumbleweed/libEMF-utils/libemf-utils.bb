SUMMARY = "Library for manipulation with Enhanced MetaFile (EMF, ECMA-234)"
DESCRIPTION = "LibEMF is a C/C++ library which provides a drawing toolkit based on \
ECMA-234. The general purpose of this library is to create vector \
graphics files on POSIX systems which can be imported into \
StarOffice/OpenOffice. The Enhanced MetaFile (EMF) is one of the two \
color vector graphics format which is 'vectorially' understood by \
SO/OO. The EMF format also has the additional advantage that it can be \
'broken' into its constituent components and edited like any other \
SO/OO graphics object."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.13"

RPM_NAME = "libEMF-utils-1.0.13-3.4.aarch64.rpm"
RPM_HASH = "0127898ab472ae9985528dd3254cf04c71f04a95b775c8470ec72a163542eee886002ab13fcde0034df70c510f37d9d95a543a45e08cdc95d6007ff5801e8dac"

RPROVIDES:${PN} += "libEMF-/usr/bin/printemf \
libEMF-utils"

RDEPENDS:${PN} += "libEMF.so.1 \
libc.so.6"

inherit rpm

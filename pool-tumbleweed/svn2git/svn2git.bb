SUMMARY = "Importer for one time conversion from SVN to Git"
DESCRIPTION = "Tool to convert an SVN repository to Git based on a custom written ruleset, in \
order to properly migrate all branches and tags."
LICENSE = "GPL-3.0-only"

PV = "1.0.18"

RPM_NAME = "svn2git-1.0.18-1.1.aarch64.rpm"
RPM_HASH = "c48c4ddd63e70226d762e617dc1c66d02095530909db3777e674d2dbeb321669ff10434b2d8ae0e015afa07bfd2858c1b7b2959a2119f75960e79d09fe36ac2e"

RPROVIDES:${PN} += "svn2git"

RDEPENDS:${PN} += "git \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libapr-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libsvn-fs-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm

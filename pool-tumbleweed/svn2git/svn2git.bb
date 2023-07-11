SUMMARY = "Importer for one time conversion from SVN to Git"
DESCRIPTION = "Tool to convert an SVN repository to Git based on a custom written ruleset, in \
order to properly migrate all branches and tags."
LICENSE = "GPL-3.0-only"

PV = "1.0.16"

RPM_NAME = "svn2git-1.0.16-1.22.aarch64.rpm"
RPM_HASH = "7185d919c8c75e4efb1dcca01964395d212deb71f7488ccd411fef4321bff25421f9f9ef158ba90e971a5b8ac3b5d106d4e094a73b70c54f3cd9e92a2c09c85c"

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

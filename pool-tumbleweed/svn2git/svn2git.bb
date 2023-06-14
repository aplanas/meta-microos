SUMMARY = "Importer for one time conversion from SVN to Git"
DESCRIPTION = "Tool to convert an SVN repository to Git based on a custom written ruleset, in \
order to properly migrate all branches and tags."
LICENSE = "GPL-3.0-only"

PV = "1.0.16"

RPM_NAME = "svn2git-1.0.16-1.21.aarch64.rpm"
RPM_HASH = "2daf2857bbc9124864a4e9de5cb4e840ebf63440cf6c6c9dc3167b350f26d3c414f392a4e7ab285ba5eadb4aaa09a6987770dec9d23eff7093937b48cb0fdbd3"

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

SUMMARY = "Importer for one time conversion from SVN to Git"
DESCRIPTION = "Tool to convert an SVN repository to Git based on a custom written ruleset, in \
order to properly migrate all branches and tags."
LICENSE = "GPL-3.0-only"

PV = "1.0.16"

RPM_NAME = "svn2git-1.0.16-1.21.aarch64.rpm"
RPM_HASH = "2daf2857bbc9124864a4e9de5cb4e840ebf63440cf6c6c9dc3167b350f26d3c414f392a4e7ab285ba5eadb4aaa09a6987770dec9d23eff7093937b48cb0fdbd3"

RPROVIDES:${PN} += "svn2git \
svn2git(aarch-64)"

RDEPENDS:${PN} += "git \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libapr-1.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libsvn_fs-1.so.0()(64bit) \
libsvn_repos-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
subversion"

inherit rpm

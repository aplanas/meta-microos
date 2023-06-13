SUMMARY = "Client for Berkeley Open Infrastructure for Network Computing"
DESCRIPTION = "The Berkeley Open Infrastructure for Network Computing (BOINC) is a \
software platform which supports distributed computing, primarily in \
the form of 'volunteer' computing and 'desktop grid' computing. It is \
well suited for problems which are often described as 'trivially \
parallel'. BOINC is the underlying software used by projects such as \
Einstein@Home, ClimatePrediciton.net, the World Community \
Grid, and many other distributed computing projects. \
 \
This package installs the BOINC client software, which will allow \
your computer to participate in one or more BOINC projects, using \
your spare computer time to search for cures for diseases, model \
protein folding, study global warming, discover sources of \
gravitational waves, and many other types of scientific and \
mathematical research."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.2"

RPM_NAME = "boinc-client-7.22.2-1.1.aarch64.rpm"
RPM_HASH = "eb00acff1893bd6c49f53e05d9b2f80ac0cb9caecd23875ae3f688c4517d5a4ea7aa231585d0b6d832bc9e7d6d8a544cf18a527ffc7c58b3ee246ab0690e1ad1"

RPROVIDES:${PN} += "boinc-client \
boinc-client(aarch-64) \
config(boinc-client)"

RDEPENDS:${PN} += "/bin/sh \
ca-certificates-mozilla \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboinc.so.7()(64bit) \
libboinc_crypt.so.7()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libz.so.1()(64bit) \
shadow"

inherit rpm

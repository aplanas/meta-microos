SUMMARY = "Tool to write CD-Rs in Disk-At-Once Mode"
DESCRIPTION = "CDRDAO creates CD-Rs in disk-at-once (DAO) mode driven by a description \
file called a TOC file. In DAO mode, it is possible to create \
non-standard track pregaps that have lengths other than 2 seconds and \
contain nonzero audio data. This is useful for dividing live recordings \
into tracks where 2 second gaps would be irritating."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "cdrdao-1.2.4-1.13.aarch64.rpm"
RPM_HASH = "3cc2d27b59c6ccd139a8d564646e5f0116f9484fa7c1cafaacf98e6e5ac2e281104a60da2ca11510bbce8538f54fb34206486ef43953c67718c0354786e422c4"

RPROVIDES:${PN} += "cdrdao cdrdao(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libao.so.4()(64bit) libao.so.4(LIBAO4_1.1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmad.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvorbisfile.so.3()(64bit)"

inherit rpm

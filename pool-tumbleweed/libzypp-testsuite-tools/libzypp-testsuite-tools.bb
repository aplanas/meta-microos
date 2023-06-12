SUMMARY = "Package, Patch, Pattern, and Product Management - testsuite-tools"
DESCRIPTION = "Package, Patch, Pattern, and Product Management - testsuite-tools \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de> \
    Jiri Srain <jsrain@suse.cz> \
    Stefan Schubert <schubi@suse.de> \
    Duncan Mac-Vicar <dmacvicar@suse.de> \
    Klaus Kaempf <kkaempf@suse.de> \
    Marius Tomaschewski <mt@suse.de> \
    Stanislav Visnovsky <visnov@suse.cz> \
    Ladislav Slezak <lslezak@suse.cz>"
LICENSE = "GPL-2.0-only"

PV = "5.0.5"

RPM_NAME = "libzypp-testsuite-tools-5.0.5-1.7.aarch64.rpm"
RPM_HASH = "000e14579df0b45c5bb338e011825eafa41ccd3af833399cd4ea8e7b0780a7c04260bb5d34a699abf3de86aeaed57802d1db9e5a2b80bfd60a0d132700c71dea"

RPROVIDES:${PN} += "libzypp-testsuite-tools \
libzypp-testsuite-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libzypp.so.1722()(64bit) \
libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm

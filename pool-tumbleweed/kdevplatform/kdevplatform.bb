SUMMARY = "Base Package for Integrated Development Environments"
DESCRIPTION = "This package contains the common plugins for integrated developments \
environment based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevplatform-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bdd5900b270acd8df5125f3d9cf7fdbd501ae4ed499764a93844b3edf172e1590da68ff7415a94a13dd201a55c8ce124949c3cf2a48b5a432804866e3446dc5a"

RPROVIDES:${PN} += "kdevplatform \
kdevplatform(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/bin/zsh \
/sbin/ldconfig \
grantlee5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKDevPlatformLanguage.so.511()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkdevplatform511 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

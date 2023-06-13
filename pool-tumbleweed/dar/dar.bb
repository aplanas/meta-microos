SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar (Disk Archive) is a hardware-independent backup solution. Dar uses \
catalogs (unlike tar),which it makes it possible to extract a single \
file without having to read the entire archive. It is also possible to \
create incremental backups. Dar archives can also be created or used \
with the libdar library (for example, with KDar, a KDE application). \
This package contains the command line tools and documentation."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.8"

RPM_NAME = "dar-2.7.8-1.4.aarch64.rpm"
RPM_HASH = "943e9bf0f5ed18b91e3c799a3c5a6b3b8140a2b487c0aa1582d1e237f0e4cd210c07b601fbc9f16ea01aa902a2cdcd96dc8e0144afb8c45776d7a0540bb435a6"

RPROVIDES:${PN} += "dar \
dar(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libdar64.so.6000()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgpgme.so.11()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

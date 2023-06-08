SUMMARY = "AdPlug Database Maintenance Utility"
DESCRIPTION = "adplugdb maintains database files in AdPlug database format. It can add, list \
and remove records within a central database, or merge a set of databases \
together into one single database."
LICENSE = "LGPL-2.1-only"

PV = "2.3.3"

RPM_NAME = "adplugdb-2.3.3-1.3.aarch64.rpm"
RPM_HASH = "6383f18bf26149c8a6b08d99652023c149a9e7f0e43b78ccddc78bc446ee51bde7029163290db09cc59dadf531a2890a33b651cb1da303856d89c286d00dc366"

RPROVIDES:${PN} += "adplugdb adplugdb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadplug-2.3.3.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm

SUMMARY = "A set of tools for auditing wireless networks"
DESCRIPTION = "Aircrack-ng is a suite of tools to assess network security. \
The main capabilities of aircrack-ng is to monitor, attack, test and crack WiFi networks \
for auditing purposes."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-1.7-2.3.aarch64.rpm"
RPM_HASH = "20bde22c8e1a416e041d77c9baf005530a2710f9f2b07081db9ce3bb53efb6b83c4cc3b0e4118e1b154fd600794b012ecc758a80418a65a5891f413bb83811cb"

RPROVIDES:${PN} += "aircrack-ng \
aircrack-ng(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ethtool \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libhwloc.so.15()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libpcap.so.1()(64bit) \
libpcre.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit) \
python(abi) \
python3-graphviz \
wireless-tools"

inherit rpm

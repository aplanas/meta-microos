SUMMARY = "Python bindings for gr-iqbal"
DESCRIPTION = "The Python Bindings for gr-iqbal."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "python3-gr-iqbal-0.39.0git20210108-1.12.aarch64.rpm"
RPM_HASH = "098a7aa06ff51a1633960a613afc49c986d7dd2c8130836dd9bbdde88585ca62cd714fd7a37d9442f1fa0ad4b0a91c051cdc72e731ce04ed065ec2dd11380249"

RPROVIDES:${PN} += "python3-gr-iqbal \
python3-gr-iqbal(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgnuradio-iqbalance.so.3.9.0()(64bit) \
libgnuradio-iqbalance3_9_0 \
libgnuradio-runtime.so.3.10.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi)"

inherit rpm

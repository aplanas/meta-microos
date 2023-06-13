SUMMARY = "Tools to work with publications in Microsoft Publisher file-format"
DESCRIPTION = "Command line tools to work with publications in Microsoft Publisher file-format."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-tools-0.1.4-2.24.aarch64.rpm"
RPM_HASH = "0522a7ae4a5ee478e55d4f8883577a830483214a02a4fdcd5f3bcf12a96a8af00c782da958d510a213df0ca7bf1e746a20ce8ab4a75f1859022722b65022c96c"

RPROVIDES:${PN} += "libmspub-tools \
libmspub-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmspub-0.1.so.1()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-generators-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm

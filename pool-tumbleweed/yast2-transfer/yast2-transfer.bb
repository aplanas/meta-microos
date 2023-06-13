SUMMARY = "YaST2 - Agent for Various Transfer Protocols"
DESCRIPTION = "A YaST2 Agent for various Transfer Protocols: FTP, HTTP, and TFTP."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-transfer-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "9f2ce1718b632da77d0d68462c9e40a3de9bcb65affbe0ed68de79a264ec04c7e178280b8758e47e63adff39585b85cf1a7f6f788b04d4c76f4bcaeb1897cfc6"

RPROVIDES:${PN} += "libpy2ag_curl.so.2()(64bit) \
libpy2ag_tftp.so.2()(64bit) \
yast2-agent-curl \
yast2-agent-curl-devel \
yast2-agent-tftp \
yast2-agent-tftp-devel \
yast2-transfer \
yast2-transfer(aarch-64)"

RDEPENDS:${PN} += "curl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libscr.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
yast2-ruby-bindings"

inherit rpm

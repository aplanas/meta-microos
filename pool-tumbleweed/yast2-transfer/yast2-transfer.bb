SUMMARY = "YaST2 - Agent for Various Transfer Protocols"
DESCRIPTION = "A YaST2 Agent for various Transfer Protocols: FTP, HTTP, and TFTP."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-transfer-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "9f2ce1718b632da77d0d68462c9e40a3de9bcb65affbe0ed68de79a264ec04c7e178280b8758e47e63adff39585b85cf1a7f6f788b04d4c76f4bcaeb1897cfc6"

RPROVIDES:${PN} += "libpy2ag-curl.so.2 \
libpy2ag-tftp.so.2 \
yast2-agent-curl \
yast2-agent-curl-devel \
yast2-agent-tftp \
yast2-agent-tftp-devel \
yast2-transfer"

RDEPENDS:${PN} += "curl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2-ruby-bindings"

inherit rpm

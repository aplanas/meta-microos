SUMMARY = "YaST2 - Agent for Various Transfer Protocols"
DESCRIPTION = "A YaST2 Agent for various Transfer Protocols: FTP, HTTP, and TFTP."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-transfer-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "e4133e3257509d450d7618453d1b635858c9a8a34d38acd191a78591180701ba7bdb8c0b92acc0401ee08e3445c7ebdb60060b837bd63fee386a4f8b8c60804f"

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

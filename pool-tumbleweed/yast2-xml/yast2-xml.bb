SUMMARY = "YaST2 - XML Agent"
DESCRIPTION = "The YaST2 XML agent"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-xml-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "7934af51ca88f5d056c0ce4829b593ab4fd42526d84bfee8d2779f4a013230a38044f656cfda53d6a742a3ed87dccb2b0c61c7e282e3532871b593dac7d114e6"

RPROVIDES:${PN} += "libpy2ag-xml.so.2 \
yast2-agent-xml \
yast2-agent-xml-devel \
yast2-lib-xml \
yast2-xml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
libxml2.so.2 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2-core"

inherit rpm

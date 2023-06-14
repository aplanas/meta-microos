SUMMARY = "YaST2 - XML Agent"
DESCRIPTION = "The YaST2 XML agent"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-xml-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "f83803a4886602d6487ec76593eabf8a44123d5d77a58272d1133972ff6e2744b9259d72163b7676615af07f9ad5211d4584a3bcf07f19a1998bb8b9fa51227d"

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

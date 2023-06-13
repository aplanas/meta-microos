SUMMARY = "YaST2 - XML Agent"
DESCRIPTION = "The YaST2 XML agent"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-xml-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "f83803a4886602d6487ec76593eabf8a44123d5d77a58272d1133972ff6e2744b9259d72163b7676615af07f9ad5211d4584a3bcf07f19a1998bb8b9fa51227d"

RPROVIDES:${PN} += "libpy2ag_xml.so.2()(64bit) \
yast2-agent-xml \
yast2-agent-xml-devel \
yast2-lib-xml \
yast2-xml \
yast2-xml(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libscr.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
yast2-core"

inherit rpm

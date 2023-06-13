SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_qa-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "9b50c4478c3df4cf89d5e6f123e58aab50f7a69ac99760c103695f905aef235c1fc8b05c8608f0caaa04871100923c4290c75856ec1bef6265eb132508b3d0e4"

RPROVIDES:${PN} += "libwx_qtu_qa-suse.so.9.0.0()(64bit) \
libwx_qtu_qa-suse9_0_0 \
libwx_qtu_qa-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit)"

inherit rpm

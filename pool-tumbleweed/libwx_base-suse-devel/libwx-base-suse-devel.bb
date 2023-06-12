SUMMARY = "Development files for wxGTK3-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. \
This package is a build artifact and need not be manually installed."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_base-suse-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "f6d436c58e7f57890106850fb8e7cbf018133b4d3b90a13ab6f12ea64451cff36b04ae4f43aecab7cc6cd212986a3e6ba5263acfc5254b5ce2db1107e6a85d68"

RPROVIDES:${PN} += "libwx_base-devel \
libwx_base-suse-devel \
libwx_base-suse-devel(aarch-64)"
RDEPENDS:${PN} += "libwx_baseu-suse9_0_0 \
libwx_baseu_net-suse9_0_0 \
libwx_baseu_xml-suse9_0_0"

inherit rpm
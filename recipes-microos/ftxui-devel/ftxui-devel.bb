SUMMARY = "Devel files for ftxui"
DESCRIPTION = "Development files for ftxui."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ftxui-devel-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "cff5f94d110da24831b4a82e8fa56e641a0453b01a1d738c5eac49952c9c7b92429820b7c587c47115e9f8008e4d5e5deb5bf67f9ceece38622fcb61b2a519fc"

RPROVIDES:${PN} += "cmake(ftxui) ftxui-devel ftxui-devel(aarch-64)"
RDEPENDS:${PN} += "libftxui4_0_0"

inherit rpm

SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-apple-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "4901aa65070519b53bf06659ed8eee83151bf23ab8115e8115e91269159f61fb01897873ba67c3418cb4c4cd466533c524f519c8f9bb03225e039d33570865bc"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

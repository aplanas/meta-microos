SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-sprd-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "114b54df84b88df965ceb8d8b01df2177dcf853715d29968d3f13c45da3589ebcc2599155eb4d540ab9e15dc9b094d9e8b280d39480fc4d479fb4ccfe5c4e6f9"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

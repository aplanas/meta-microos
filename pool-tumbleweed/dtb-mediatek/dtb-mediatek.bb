SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-mediatek-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "ced07f7a061b0de808a2a597212856599c80921a2f1cd30ac4e002db146d642ae614b468c6cc9cd0c925a912861111c0cafbc7915838223c27a4eefb68ba840e"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

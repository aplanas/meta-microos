SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-qcom-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "7966d2216845ce42893af50135e4127b769d918f66344ae086c6f836f5cb14136672067c6421073c04678056db5ecfcc7b6164addebbbd73481fbdb23beae99c"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

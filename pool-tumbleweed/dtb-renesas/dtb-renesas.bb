SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-renesas-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "39b06babb3b3672eda2deac1e55563b341ef0488a7ea7860a4af7fed6386e2772e132292db9a85337d66a0b3a7ce16d4c78313a61d8dce03888ee753329a513c"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

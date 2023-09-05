SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-allwinner-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "765d4201e18e780845d97433f1d17e3edb189ec0a375272a957441f98c15d718d289bfe6ef6e862ac8ba78fe4b154b0873490eff776baed5afe3b64f1bed4779"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

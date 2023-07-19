SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-hisilicon-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "732c67fa9e88890d636fdc9c5c72b5264ab8e7d9b48822ffee810b7b3651adad514fea217b9f921c85cdbd6315df1fd84f7ec29e206c07d59b659214ff6198ed"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm

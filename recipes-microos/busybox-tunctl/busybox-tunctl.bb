SUMMARY = "Busybox applets replacing tunctl"
DESCRIPTION = "This package contains the symlinks to provide tunctl with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-tunctl-1.36.0-26.3.noarch.rpm"
RPM_HASH = "9e88ec2c05165095da2f5eceb3847c1fccdd26f7d84fb0dccd5cf68c4d7dfd08c822e93b8a1d9c5f1ab667bafb0c869f6ee9ea060f29eff7486c2310df945749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tunctl"
RDEPENDS:${PN} += "busybox"

inherit rpm

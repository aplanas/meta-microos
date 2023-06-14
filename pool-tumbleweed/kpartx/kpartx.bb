SUMMARY = "Manages partition tables on device-mapper devices"
DESCRIPTION = "The kpartx program maps linear devmaps to device partitions, which \
makes multipath maps partionable."
LICENSE = "GPL-2.0-only"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "kpartx-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "61ff0d1d2c2725e99de02687a0f3d459b5b65bd410aa4083e414af33308991aaaa5b2082dbb9022e4120601107a89ee2ee1ee66c9adf9d11a85219a1238421fa"

RPROVIDES:${PN} += "kpartx"

RDEPENDS:${PN} += "/bin/sh \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm

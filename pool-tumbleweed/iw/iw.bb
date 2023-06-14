SUMMARY = "Configuration utility for nl80211 based wireless drivers"
DESCRIPTION = "iw is a nl80211 based CLI configuration utility for wireless devices. It \
supports almost all new drivers that have been added to the kernel \
recently."
LICENSE = "ISC"

PV = "5.19"

RPM_NAME = "iw-5.19-1.4.aarch64.rpm"
RPM_HASH = "90d5ff0faa1de3fad753ebac1e31dc28cc793ae07c6cb02211fdd313ac9c28ae9941910a3441ea7db96d66b0723b902ef0e5f28150f849354ee53734f34fa193"

RPROVIDES:${PN} += "iw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm

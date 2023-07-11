SUMMARY = "Configuration utility for nl80211 based wireless drivers"
DESCRIPTION = "iw is a nl80211 based CLI configuration utility for wireless devices. It \
supports almost all new drivers that have been added to the kernel \
recently."
LICENSE = "ISC"

PV = "5.19"

RPM_NAME = "iw-5.19-1.5.aarch64.rpm"
RPM_HASH = "6192e9ac99508d1ad8c69937537bbacd7909d9fd49dbbaee8b4ea94bf31180e903b0549d0964c23f179fa85d6c12af75d1ac7a26ab1bbd8d0287b2d8d5607b7b"

RPROVIDES:${PN} += "iw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm

SUMMARY = "Configuration of isns"
DESCRIPTION = "-"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-isns-4.6.0-1.1.noarch.rpm"
RPM_HASH = "a7dc1c28d3ef78e94e72162a52a02da82e0116779a1a72d2ba2e1b54462d071329147f24f70e68217ef76cf91503af8a7e43230adc632a462db032e5d3534a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.iSNS.desktop) \
metainfo() \
metainfo(org.opensuse.yast.iSNS.metainfo.xml) \
yast2-isns"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm

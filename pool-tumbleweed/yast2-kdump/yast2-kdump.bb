SUMMARY = "Configuration of kdump"
DESCRIPTION = "Configuration of kdump"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-kdump-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "0531d5045b99c75196a5a1ec3ee527be026516693a851dcc1682a6d6e5cfb0627ac3d9f6f20d3fe19a0ea6c3664b8da972fcd03ecc2255d08ea1309a853132fc"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Kdump.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Kdump.metainfo.xml) \
yast2-kdump \
yast2-kdump(aarch-64)"

RDEPENDS:${PN} += "yast2 \
yast2-bootloader \
yast2-packager \
yast2-ruby-bindings"

inherit rpm

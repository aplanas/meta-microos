SUMMARY = "YaST2 - Update"
DESCRIPTION = "Use this component if you wish to update your system."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-update-FACTORY-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "2f8508e678c7506a76dc3e3b13d3ee2be0779cb86f6bed30ac4cf6ef1f8c8279ce64bb1731eeb41173c0fd899d654b055eed16ce34129cdeb671a0caf866e7ca"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Update.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Update.metainfo.xml) \
yast2-update-FACTORY \
yast2-update-FACTORY(aarch-64) \
yast2-update:/usr/share/YaST2/clients/update.ycp"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
yast2 \
yast2-ruby-bindings \
yast2-update"

inherit rpm

SUMMARY = "YaST2 - Update"
DESCRIPTION = "Use this component if you wish to update your system."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-update-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "f1c67d0871a14fe6a8699b8590e57ed340f8753e6bac219986e630b5e3afca97f6c4701cfad2a09b4255ba4fd9b011426c72610e0fc3e4d97bcb620d7d941f45"

RPROVIDES:${PN} += "yast2-installation:/usr/share/YaST2/clients/vendor.ycp \
yast2-update \
yast2-update(aarch-64)"
RDEPENDS:${PN} += "pigz \
rubygem(ruby:3.2.0:nokogiri) \
yast2 \
yast2-installation \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm

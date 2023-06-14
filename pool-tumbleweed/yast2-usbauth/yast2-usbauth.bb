SUMMARY = "YaST2 component for usbauth configuration"
DESCRIPTION = "YaST module that helps to create an usbauth firewall config file"
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "yast2-usbauth-0.9-1.12.noarch.rpm"
RPM_HASH = "61a93d54121bc55b31c4a222191a8550f3b7ff51032c37a58c38866b34ae83228777511457aa0f61ddbcec7243fca4dc0957ebd31295fb1b9939fbe9bfffc4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-usbauth"

RDEPENDS:${PN} += "libusbauth-configparser1 \
rubygem-ffi \
xdg-utils \
yast2 \
yast2-ruby-bindings"

inherit rpm

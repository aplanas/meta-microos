SUMMARY = "YaST2 - NTP Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for NTP client configuration."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-ntp-client-4.6.0-1.2.noarch.rpm"
RPM_HASH = "d35a40518a6c0103b09abcbb507cb906bb2aa63ec041906ceddd7dcc6e2c908e467b15f9878f1119de67fd9865e1beb9a1cc7e2ddb8b987ab1ee7b3e3fe6d135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-ntp-client"

RDEPENDS:${PN} += "/usr/bin/sh \
augeas-lenses \
rubygem-ruby-3.2.0-cfa \
systemd \
yast2 \
yast2-country-data \
yast2-network \
yast2-ruby-bindings"

inherit rpm

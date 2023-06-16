SUMMARY = "YaST2 - NTP Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for NTP client configuration."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-ntp-client-4.6.0-1.1.noarch.rpm"
RPM_HASH = "45444fb278e4ec655d27ebb3e1fbf0c83be65f0eb144ba037c05375aac0a1394d0e59187ce2e470c59a8ae592d9b3a8984b85b52c1f4c4f7387f0a2967726a6f"
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

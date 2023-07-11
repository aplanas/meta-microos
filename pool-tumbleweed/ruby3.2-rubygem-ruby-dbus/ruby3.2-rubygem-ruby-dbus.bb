SUMMARY = "Ruby module for interaction with D-Bus"
DESCRIPTION = "Pure Ruby module for interaction with D-Bus IPC system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.0.beta2"

RPM_NAME = "ruby3.2-rubygem-ruby-dbus-0.23.0.beta2-1.1.aarch64.rpm"
RPM_HASH = "d5a4074c68b1505ae88a92ccf73b7911f1d326db310ffddbed80c1e8dadab2be30a079652080980b07d42f63767c00731c7946c06aa60e7f0c780d0ad83404c3"

RPROVIDES:${PN} += "ruby-dbus \
ruby3.2-rubygem-ruby-dbus \
rubygem-ruby-3.2.0-ruby-dbus \
rubygem-ruby-3.2.0-ruby-dbus-0 \
rubygem-ruby-3.2.0-ruby-dbus-0.23 \
rubygem-ruby-3.2.0-ruby-dbus-0.23.0 \
rubygem-ruby-dbus"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-rexml"

inherit rpm

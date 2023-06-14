SUMMARY = "Ruby module for interaction with D-Bus"
DESCRIPTION = "Pure Ruby module for interaction with D-Bus IPC system."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "ruby3.2-rubygem-ruby-dbus-0.22.1-1.1.aarch64.rpm"
RPM_HASH = "f566cdd411f634696505835c00dc9c685f2d37f085365b018344a0ce55088c694202d911e2620051ba3bd65ff6d89ad95cff4304eb0eeec51ad94bd92e7d58b3"

RPROVIDES:${PN} += "ruby-dbus \
ruby3.2-rubygem-ruby-dbus \
rubygem-ruby-3.2.0-ruby-dbus \
rubygem-ruby-3.2.0-ruby-dbus-0 \
rubygem-ruby-3.2.0-ruby-dbus-0.22 \
rubygem-ruby-3.2.0-ruby-dbus-0.22.1 \
rubygem-ruby-dbus"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-rexml"

inherit rpm

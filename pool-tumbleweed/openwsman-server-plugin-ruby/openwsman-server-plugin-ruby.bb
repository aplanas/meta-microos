SUMMARY = "OpenWSMAN Server Plugin for Ruby extensions"
DESCRIPTION = "This package provides a OpenWSMAN server plugin to write a \
WS-Management resource handler in Ruby."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-plugin-ruby-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "477b539bc218fcf7d5f7357934011f8ecd555aa3b87530dd47a33f1c758213135a429b4ef13f9da611421ce8d9eb5dd2f7f68d177397f150f36ab85c1c2d2a80"

RPROVIDES:${PN} += "libwsman-ruby-plugin.so \
openwsman-server-plugin-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
openwsman-server"

inherit rpm

SUMMARY = "OpenWSMAN Server Plugin for Ruby extensions"
DESCRIPTION = "This package provides a OpenWSMAN server plugin to write a \
WS-Management resource handler in Ruby."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-plugin-ruby-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "edcbf197c42dbe2fc6615aa32408faabf271d56cf53bf95ecc9d5bea896e333e7c529bb7bac320c35152da420d0c731aca66c139fd35e8065eb38d837f60b67a"

RPROVIDES:${PN} += "libwsman-ruby-plugin.so \
openwsman-server-plugin-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
openwsman-server"

inherit rpm

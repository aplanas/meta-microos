SUMMARY = "OpenWSMAN Server Plugin for Ruby extensions"
DESCRIPTION = "This package provides a OpenWSMAN server plugin to write a \
WS-Management resource handler in Ruby."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-plugin-ruby-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "ab597bfdc52d474a4ff02c6bf68e3ff77f167ccdd71c2b730f63e2dacbfe96558e6ba6ad7b02eac184df7e91d638fb2732cde397f13125347c9022378b412e37"

RPROVIDES:${PN} += "libwsman-ruby-plugin.so \
openwsman-server-plugin-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
openwsman-server"

inherit rpm

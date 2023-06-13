SUMMARY = "Utility to manage outputs of a Wayland compositor"
DESCRIPTION = "wlr-randr is a command line utility to manage outputs of a Wayland compositor."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "wlr-randr-0.2.0-1.11.aarch64.rpm"
RPM_HASH = "e10fa1c005955917422a0e884681c03ad1b96be7b9920a78d1fac2ec47ae36242fb88cb1fb427c3fdd04e3b5f5d9859977c87ef35b59984a9d5c7cc2d358be8e"

RPROVIDES:${PN} += "wlr-randr \
wlr-randr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm

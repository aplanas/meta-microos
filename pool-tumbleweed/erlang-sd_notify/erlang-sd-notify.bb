SUMMARY = "Erlang interface to systemd notify subsystem"
DESCRIPTION = "Erlang module for native access to the systemd-notify facilities."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "erlang-sd_notify-1.1-2.2.aarch64.rpm"
RPM_HASH = "19f65947a98b0d2c9f99ae1327b569e3f7ab5f09ae1acd258760eeb1a830d22fc1b6614edc020d162c5a2f26b8faddd2311a8e2be2adeb4789e45c48e5a3aad2"

RPROVIDES:${PN} += "erlang-sd-notify"

RDEPENDS:${PN} += "erlang"

inherit rpm

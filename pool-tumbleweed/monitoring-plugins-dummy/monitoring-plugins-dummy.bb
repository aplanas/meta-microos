SUMMARY = "Dummy check"
DESCRIPTION = "This plugin will simply return the state corresponding to the numeric value of \
the <state> argument with optional text."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dummy-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "d01d2f0cb6a8516e5ed5f89b36f34121ecb0c3e7e66f2a038848502756941f96bc1345e410bc1fbad7301ec295a7689da4e5fc0728c52cf0506446849f191db2"

RPROVIDES:${PN} += "monitoring-plugins-dummy \
nagios-plugins-dummy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

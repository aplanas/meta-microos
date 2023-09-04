SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-doc-253.8-1.2.aarch64.rpm"
RPM_HASH = "2b4d3a1e82db0b6e44530db40dcec79a787401f2d2bad42f5f02dde6d340f443287a437c8733d4991464e1e54297c4c270771aae9b139cfc9bc3039b9de8eaa5"

RPROVIDES:${PN} += "systemd-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "A collection of plugins for xviewer"
DESCRIPTION = "This package contains plugins for additional features in xviewer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugins-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "03638c44fb1b72672b30a96de08d3747e04c5de16d0730bb258ed40942f009c41506bb6fbb917d71c6df9564347982a0a0616346e0495889cd4e27719181ad72"

RPROVIDES:${PN} += "xviewer-plugins"

RDEPENDS:${PN} += "xviewer"

inherit rpm

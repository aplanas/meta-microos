SUMMARY = "Nano syntax highlighting for icinga2"
DESCRIPTION = "Provides Nano syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "nano-icinga2-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "4fc441827f464d32f6a43ecc07334a75c83eba210673dbdc488fc431c68bdb745a1ddb2b383721f978accec6130c46e7e6233200dd17d31c8fe688a4d9c56bba"

RPROVIDES:${PN} += "nano-icinga2"

RDEPENDS:${PN} += "nano"

inherit rpm

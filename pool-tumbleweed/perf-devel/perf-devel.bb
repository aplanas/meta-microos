SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "perf-devel-6.4.3-80.10.aarch64.rpm"
RPM_HASH = "a3e6f44d4cac81956af5b1837e6ddbf291ed088925504630da69c2edf454dbd61c527ab3da85cf2d19c6d96644c0b5dd8b7c830b3b1bd45fdc3dfa0c649eee04"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm

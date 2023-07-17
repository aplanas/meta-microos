SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "perf-devel-6.4.2-80.9.aarch64.rpm"
RPM_HASH = "f9022fff564e106990d5f5b1cdc3e51107f9a7bc9006f3e3fde1a1550bdaa415cd752a98b13604cb4c82967b93f89b278f567ac4cc1911f0fc0d4b9ef086a3e4"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm

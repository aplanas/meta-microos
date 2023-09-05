SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "perf-devel-6.4.12-81.2.aarch64.rpm"
RPM_HASH = "0f9a285d32ba43ec838ff89cf36256275dc3239d4c0840d65f84b5188b93d48ed83c82dae0bdfa4ce563536812151e5dc33c5d6d002966cc1cbfb0ddcf8b2aea"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm

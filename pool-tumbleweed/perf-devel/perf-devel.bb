SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "perf-devel-6.4.6-80.12.aarch64.rpm"
RPM_HASH = "9c276d9ea79d9c230180401b2c854c286d1b367e4f5b9fc75183e1937db570eee487598beebdc6a7643db569b8df0f3574ab4546bff27b282ef3f3b8e0ff03ef"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm

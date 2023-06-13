SUMMARY = "Static PAPI libraries"
DESCRIPTION = "This package includes the static PAPI libraries."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-devel-static-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "5c0dde0ea0420654e27c1fedbf3f4d6d29d31f606e8c0820998f8a5a49f1a2428cf732100bd1fd945c9af9355ed3a50122b8c96e20bc837af521a7e3315965e9"

RPROVIDES:${PN} += "papi-devel-static \
papi-devel-static(aarch-64)"

RDEPENDS:${PN} += "linux-kernel-headers \
papi-devel"

inherit rpm

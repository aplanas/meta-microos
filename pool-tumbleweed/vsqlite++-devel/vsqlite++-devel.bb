SUMMARY = "Development files for vsqlite++"
DESCRIPTION = "This package contains development files for vsqlite++."
LICENSE = "BSD-3-Clause"

PV = "0.3.13"

RPM_NAME = "vsqlite++-devel-0.3.13-4.11.aarch64.rpm"
RPM_HASH = "55f2fc2bab0647868bccc96455a47e6c0fb3a7d8e94c2172585ee4d4f532340f04f8c83501c580ed16b630a211ee81933038d4db11f96e5478fbaa5793ad425f"

RPROVIDES:${PN} += "vsqlite++-devel"

RDEPENDS:${PN} += "libvsqlitepp3"

inherit rpm

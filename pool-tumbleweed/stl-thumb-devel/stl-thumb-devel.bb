SUMMARY = "Files needed for stl-thumb development"
DESCRIPTION = "Files needed to develop applications for the stl-thumb."
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "stl-thumb-devel-0.5.0~0-2.1.aarch64.rpm"
RPM_HASH = "b0650e1986c23af033eb758735c1324f4f242c42bc8a3e75ace80e2f5e54b5c10cbf5b9f38fee1a0045aae14401516b8f2537a525f9f40eaa69b59b75fdf2caa"

RPROVIDES:${PN} += "stl-thumb-devel"

RDEPENDS:${PN} += "libstl-thumb"

inherit rpm

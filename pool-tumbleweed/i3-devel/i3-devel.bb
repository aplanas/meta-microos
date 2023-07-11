SUMMARY = "Development headers for i3"
DESCRIPTION = "Development headers for the i3 window manager."
LICENSE = "BSD-3-Clause"

PV = "4.22"

RPM_NAME = "i3-devel-4.22-1.4.aarch64.rpm"
RPM_HASH = "ce462557fccc56135873112a32dc6b960f9c0c6f0abb382a4633cb532e19a8f4afbd19984da0d3dee63d7b7d4c9d14420534d7a04c1afe8fb4b7141a6319b2c8"

RPROVIDES:${PN} += "i3-devel"

RDEPENDS:${PN} += "i3"

inherit rpm

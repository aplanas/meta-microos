SUMMARY = "Upstream branding of gcin"
DESCRIPTION = "This package provides upstream look and feel for gcin"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-branding-upstream-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "1ff990a72f40df6fbb74f8a0adeb2360a2d580f8b471e545c00360a1ad4a2f1bb9629d8b7a5353e075c7803bdb013e260d07a351087ee357d177cbd23d3565e4"

RPROVIDES:${PN} += "gcin-branding \
gcin-branding-upstream \
gcin-branding-upstream(aarch-64)"

RDEPENDS:${PN} += "gcin"

inherit rpm

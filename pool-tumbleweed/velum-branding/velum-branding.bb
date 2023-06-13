SUMMARY = "Branding for velum"
DESCRIPTION = "kubic branding themes for velum"
LICENSE = "Apache-2.0"

PV = "0.0.0+git_r22_fe3c5d0"

RPM_NAME = "velum-branding-0.0.0+git_r22_fe3c5d0-3.11.aarch64.rpm"
RPM_HASH = "6d25279dda1dff265bba5b2c090ff4a585dac04807829417e3188095fdcf5f2eea9a3407ea2675cf58122cda278488d21e8f707d13d49755ea26acc59dd26793"

RPROVIDES:${PN} += "velum-branding \
velum-branding(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

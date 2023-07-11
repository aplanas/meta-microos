SUMMARY = "Upstream branding for SDDM"
DESCRIPTION = "This package provides upstream branding for SDDM."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.0"

RPM_NAME = "sddm-branding-upstream-0.20.0-2.1.aarch64.rpm"
RPM_HASH = "bb422fc07ad610fe3c2da0c19a45bf5a08953aee3e29e9dc62e112e66e2e0161811aa910f25122d26bcbf1ef47d23c8aeebe40a8bdaad5d2a71250cdf4759011"

RPROVIDES:${PN} += "sddm-branding \
sddm-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
sddm"

inherit rpm

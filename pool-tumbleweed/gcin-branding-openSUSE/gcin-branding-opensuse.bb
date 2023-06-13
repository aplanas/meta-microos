SUMMARY = "openSUSE branding of gcin"
DESCRIPTION = "This package provides openSUSE Look and Feel for gcin"
LICENSE = "LGPL-2.1"

PV = "12.1"

RPM_NAME = "gcin-branding-openSUSE-12.1-10.32.noarch.rpm"
RPM_HASH = "c44c832b1d4269a53683f21860827d88e2e73202b62697d2652ed0d78c09eaf9d79952c25c15002294c34b545ebdce162b3984632d11cd899e23a254afacb04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcin-branding \
gcin-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
gcin"

inherit rpm

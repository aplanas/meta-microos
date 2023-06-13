SUMMARY = "Upstream Branding of libxfce4ui"
DESCRIPTION = "This package provides the upstream look and feel for libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4ui-branding-upstream-4.18.4-1.1.noarch.rpm"
RPM_HASH = "2d148ea7105dc11df64935aae2b4621890029cd60aab7de811312514252f1af0e3cfc0d91634814443b5a0f6b25c576d8c37418e9f38e26bb41a253870979bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libxfce4ui-branding-upstream) \
libxfce4ui-branding \
libxfce4ui-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

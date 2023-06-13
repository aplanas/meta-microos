SUMMARY = "Upstream Branding of xfce4-session"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Session Manager."
LICENSE = "GPL-2.0-only"

PV = "4.18.3"

RPM_NAME = "xfce4-session-branding-upstream-4.18.3-1.1.noarch.rpm"
RPM_HASH = "ea298f879a25636bb6b28c3ccba0434ce630e0a266c958cfec61647a829f3f6cf4aead445f62380e105d19b6f2afafab7f1cc400c6b1fa6b1309fc9436a03bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-session-branding-upstream) \
xfce4-session-branding \
xfce4-session-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

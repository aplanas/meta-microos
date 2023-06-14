SUMMARY = "Upstream Branding of xfwm4"
DESCRIPTION = "This package provides the upstream look and feel for the xfwm4 window manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfwm4-branding-upstream-4.18.0-1.3.noarch.rpm"
RPM_HASH = "e9ff8aff733c088591605ce5abed78a97ba63d75bd012e40c1e06eb1495481aa228a231c9b2af8cb3cbff233a104ad439555f67a6c9ce747dd6cb66a360fa9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfwm4-branding-upstream \
xfwm4-branding \
xfwm4-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

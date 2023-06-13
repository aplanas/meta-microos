SUMMARY = "Upstream Branding of xfce4-settings"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Desktop Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-branding-upstream-4.18.1-1.3.noarch.rpm"
RPM_HASH = "b591afe782a216594d8ab43cc0099c380b8b66c8982577b51f04f28947477563c0fef0411d75b60f5826690b19f16c50dd73b6402ab895d4a74d4133e599c806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-desktop-branding-upstream \
xfdesktop-branding \
xfdesktop-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

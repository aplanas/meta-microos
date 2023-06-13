SUMMARY = "Themes for Xfdashboard"
DESCRIPTION = "Additional themes for use with Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-themes-1.0.0-1.4.noarch.rpm"
RPM_HASH = "bf779eef1e7e3ff05c802dfe188b212e01e4286ca13d82cb8aaf4a23c84fab1775b41b72e298360b8579462d9531f9d99681e42e5e1f436dc35b516131a30a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfdashboard-themes"

RDEPENDS:${PN} += "xfdashboard"

inherit rpm

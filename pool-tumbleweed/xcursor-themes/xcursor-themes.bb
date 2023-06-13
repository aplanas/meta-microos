SUMMARY = "Default set of cursor themes for X"
DESCRIPTION = "This is a default set of cursor themes for use with libXcursor, \
originally created for the XFree86 Project, and now shipped as part \
of the X.Org software distribution."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xcursor-themes-1.0.7-1.1.noarch.rpm"
RPM_HASH = "0f93a73312f12f2ba462778efb85841d73fcc378ead94d0891ee29c1e4f6292ed622e3469f925dfaef0a8bf1c1881f47901707f6ab6fe4674b73c9ebdc823a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xcursor-themes"

RDEPENDS:${PN} += ""

inherit rpm

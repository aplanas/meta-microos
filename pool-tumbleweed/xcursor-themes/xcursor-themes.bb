SUMMARY = "Default set of cursor themes for X"
DESCRIPTION = "This is a default set of cursor themes for use with libXcursor, \
originally created for the XFree86 Project, and now shipped as part \
of the X.Org software distribution."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xcursor-themes-1.0.7-1.2.noarch.rpm"
RPM_HASH = "788c91bcc054acd972d02b31a031ba1ef8c495fd3aeceb01762cda2bf96f38c8bcfcd6ccd35ee99bf698671f375154b5b63d84647bddf1ba1bf899897a0e838a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xcursor-themes"

RDEPENDS:${PN} += ""

inherit rpm

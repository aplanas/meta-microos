SUMMARY = "FOP plug-in for jlatexmath"
DESCRIPTION = "This package contains the FOP plug-in for jlatexmath."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-fop-1.0.3-6.7.noarch.rpm"
RPM_HASH = "62bc14232aa5bd0c972af5d071a8ff27610788d373cf208a789f9e89fe046ff5f5f023183990db7fc0bf9113dd01e5ace9d1e1bfccb0da7e001aae9443e19f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath-fop"

RDEPENDS:${PN} += "javapackages-tools \
jlatexmath \
xmlgraphics-fop"

inherit rpm

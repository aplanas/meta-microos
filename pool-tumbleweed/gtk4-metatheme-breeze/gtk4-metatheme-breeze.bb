SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 4 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.7"

RPM_NAME = "gtk4-metatheme-breeze-5.27.7-1.1.noarch.rpm"
RPM_HASH = "9a522e19174dadd37e23b2607ed7c8c3b9e9176da78b8cc98b6e595e6cda0d6b235a2960be2750c85666b733613fd7423f0e16f089f66c62cd65d3b50eacfded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm

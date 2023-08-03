SUMMARY = "Handles source downloads defined in appimage.yml files"
DESCRIPTION = "Experimental appimage support: This parses appimage.yml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.41"

RPM_NAME = "obs-service-appimage-0.10.41-1.1.noarch.rpm"
RPM_HASH = "ba2f903e84a663ccdb860141694c034b237b58fa80543aa04c54910441fdff90f3c5a40c69042508dac0220884125cfa554840129557b2bb39139098a4d45900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-appimage"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm

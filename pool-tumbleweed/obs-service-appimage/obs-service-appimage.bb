SUMMARY = "Handles source downloads defined in appimage.yml files"
DESCRIPTION = "Experimental appimage support: This parses appimage.yml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.39"

RPM_NAME = "obs-service-appimage-0.10.39-1.1.noarch.rpm"
RPM_HASH = "f647f0a7b94f85e4706e6fb1a5be0bdd06e89fbe45102c8f3f717719441ff303d260f1dac17870f14050ebc3dadc07961b9de3e68a4b4a9d61d51dd04412ef8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-appimage"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm

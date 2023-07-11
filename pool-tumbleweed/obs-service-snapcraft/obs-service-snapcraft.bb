SUMMARY = "Handles source downloads defined in snapcraft.yaml files"
DESCRIPTION = "Experimental snapcraft support: This parses snapcraft.yaml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.39"

RPM_NAME = "obs-service-snapcraft-0.10.39-1.1.noarch.rpm"
RPM_HASH = "d1fd68408b810f06bcb25ae01fdf69cef1012fa114c145a56823b622432435545c8dd86ee3b1ed03283442c904f3aa8f1c48fcd266c51a9990dbdc53bcab8301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-snapcraft \
obs-service-tar-scm-/usr/lib/obs/service/snapcraft.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm

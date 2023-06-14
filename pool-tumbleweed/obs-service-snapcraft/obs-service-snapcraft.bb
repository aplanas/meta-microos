SUMMARY = "Handles source downloads defined in snapcraft.yaml files"
DESCRIPTION = "Experimental snapcraft support: This parses snapcraft.yaml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.36"

RPM_NAME = "obs-service-snapcraft-0.10.36-1.1.noarch.rpm"
RPM_HASH = "ee2e5121ba98af48e901dc192494d8c0cb6bbddc8e00793c4d4e3f7f209db1490a7189f282fdbf94d4b93ba464837bfc959d6ece0383a99b03df2a291a8f9b1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-snapcraft \
obs-service-tar-scm-/usr/lib/obs/service/snapcraft.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm

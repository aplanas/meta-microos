SUMMARY = "Handles source downloads defined in snapcraft.yaml files"
DESCRIPTION = "Experimental snapcraft support: This parses snapcraft.yaml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.41"

RPM_NAME = "obs-service-snapcraft-0.10.41-1.1.noarch.rpm"
RPM_HASH = "603151a1f70dae7a9f51d53dba62d84ab4e6deeacf506fb55bdf6b7ce33466fa38542142f29899c4ab332abaae5fb25d72d82d8ddbdccf25a83a7ce55b206565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-snapcraft \
obs-service-tar-scm-/usr/lib/obs/service/snapcraft.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm

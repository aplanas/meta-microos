SUMMARY = "OBS Service to add prefixed labels in Dockerfile builds"
DESCRIPTION = "An OBS service which expands LABEL instructions in Dockerfile with prefixes. \
Useful for implementing https://en.opensuse.org/Building_derived_containers#Labels."
LICENSE = "GPL-2.0-or-later"

PV = "0.0"

RPM_NAME = "obs-service-docker_label_helper-0.0-6.1.noarch.rpm"
RPM_HASH = "6fe7deaa5fd02798467b346df850e25c36278407169092643e332cfe2316dd3cdc86bef4ea47f91495747f5a50010c128989e8b6e86184b86cca51dc4c6e221f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-docker-label-helper"

RDEPENDS:${PN} += "/bin/bash \
gawk"

inherit rpm

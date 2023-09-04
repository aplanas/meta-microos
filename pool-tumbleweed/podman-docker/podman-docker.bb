SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.6.1"

RPM_NAME = "podman-docker-4.6.1-2.1.noarch.rpm"
RPM_HASH = "07ac96ccf500a259e56193ffa0b8f6dae476aac41ac16bbcb44cff475733bc39907c43c1ae5fb3af0cfe1de80deb58580d3f0015fbca6c459377ca7190e338c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm

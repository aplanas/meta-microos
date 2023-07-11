SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-docker-4.5.1-1.2.noarch.rpm"
RPM_HASH = "dfe0c591c71de6fd03560950c581fbbf916b40d7677352c0e675abd667a7e98340c85bdbc8a77db750f5bf5d722fb363324ae4fd1d1b151b65c67dcdcfc5d6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm

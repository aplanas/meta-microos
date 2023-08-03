SUMMARY = "Rootless support for Docker"
DESCRIPTION = "Rootless support for Docker. \
Use dockerd-rootless.sh to run the daemon. \
Use dockerd-rootless-setuptool.sh to setup systemd for dockerd-rootless.sh."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-rootless-extras-24.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "840ccd5371fee5a103d44b24d3d63bf737a5f9b26ec269973c170c526e4d8caaaf63d2bdd4e39698210944810e77ec3e8c33f6ac22c8e6b193fd19950fa15d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-rootless-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
fuse-overlayfs \
rootlesskit \
slirp4netns"

inherit rpm

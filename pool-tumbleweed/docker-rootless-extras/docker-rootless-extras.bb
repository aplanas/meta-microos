SUMMARY = "Rootless support for Docker"
DESCRIPTION = "Rootless support for Docker. \
Use dockerd-rootless.sh to run the daemon. \
Use dockerd-rootless-setuptool.sh to setup systemd for dockerd-rootless.sh."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-rootless-extras-24.0.5_ce-2.1.noarch.rpm"
RPM_HASH = "f9e19768a10bfd006705675ce49ed262df00df42f3982a9967345b7262b64fc7348a4f124d5b5d5d5d4116de187e928e4f5e8402cc072f8a6e1db0de2952622c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-rootless-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
fuse-overlayfs \
rootlesskit \
slirp4netns"

inherit rpm

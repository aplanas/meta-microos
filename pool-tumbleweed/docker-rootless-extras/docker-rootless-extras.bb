SUMMARY = "Rootless support for Docker"
DESCRIPTION = "Rootless support for Docker. \
Use dockerd-rootless.sh to run the daemon. \
Use dockerd-rootless-setuptool.sh to setup systemd for dockerd-rootless.sh."
LICENSE = "Apache-2.0"

PV = "24.0.4_ce"

RPM_NAME = "docker-rootless-extras-24.0.4_ce-1.1.noarch.rpm"
RPM_HASH = "f2102622f7a8b7fc587ca84a6f4d9a68ef208118b61e81da20985f24ebd43adf4a26edcac96cbea331f39fcb3cbfefb6d8e180e910fa1f0421244c0d7f044a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-rootless-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
fuse-overlayfs \
rootlesskit \
slirp4netns"

inherit rpm

SUMMARY = "Rootless support for Docker"
DESCRIPTION = "Rootless support for Docker. \
Use dockerd-rootless.sh to run the daemon. \
Use dockerd-rootless-setuptool.sh to setup systemd for dockerd-rootless.sh."
LICENSE = "Apache-2.0"

PV = "24.0.2_ce"

RPM_NAME = "docker-rootless-extras-24.0.2_ce-2.1.noarch.rpm"
RPM_HASH = "d261fcf2aaa1e13b24942dedcd651d12a27c083199f1409c50c8269e3245f5b7c49a2897ab48853abc8e56fbfb84b0765ee5f4826eac0ea6efef2fff836d7cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-rootless-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
fuse-overlayfs \
rootlesskit \
slirp4netns"

inherit rpm

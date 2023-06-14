SUMMARY = "Command line interface for interacting with tumbleweed snapshots"
DESCRIPTION = "tumbleweed-cli provides a command line interface for interacting with tumbleweed \
snapshots."
LICENSE = "GPL-2.0-only"

PV = "0.3.3"

RPM_NAME = "tumbleweed-cli-0.3.3-1.10.noarch.rpm"
RPM_HASH = "d47d9b17d916d3cc21ea2f3f7998cc9f860f353101c3cb16cc4b0ea42af1418f3d2eb2f2589149778de329e641cacc5f5566d0ae5d3ddf2ea58779c5502ff3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tumbleweed-cli"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
curl \
grep \
libzypp-repovarexpand \
sudo \
zypper"

inherit rpm

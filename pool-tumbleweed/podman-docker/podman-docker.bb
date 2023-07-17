SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-docker-4.5.1-2.1.noarch.rpm"
RPM_HASH = "6f294e204e9cba0f951859d24187bc9ac108bac51257a21e6ad7c643a0b4d679ba7b937b705b09ef98a2be1223b89f850b827bc0d195a6419dce9b8c4775024b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm

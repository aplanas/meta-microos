SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.6.2"

RPM_NAME = "podman-docker-4.6.2-1.1.noarch.rpm"
RPM_HASH = "141b0767265bd7670c20ae41ecf34e4fae2c5ceed830f4efaf81d0d4c78b6201e73fd2d01a1c88cd1eb2e7f2504827e141371a24e3ea0eb036f509ea3d1911f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm

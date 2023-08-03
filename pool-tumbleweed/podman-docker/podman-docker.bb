SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "podman-docker-4.6.0-1.1.noarch.rpm"
RPM_HASH = "e59afb9a98177af8f4fb72345d61bd6b198ea0eb36c0de7aa6f4ae363e58e97158a7b0282aa97a95b461bb64013a5d86c27692deb04abe633ef5dabec9ae8dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm

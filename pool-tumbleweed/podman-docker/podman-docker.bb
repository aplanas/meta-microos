SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-docker-4.5.1-1.1.noarch.rpm"
RPM_HASH = "b5a1e58fd133104b8a64d2cc467ce135255b1a4c7388a26009035e1fb7628d1c52d741a0bb19f52605f52b54bd475ca8e844c4edd26475eba10aac90997afaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
podman"

inherit rpm

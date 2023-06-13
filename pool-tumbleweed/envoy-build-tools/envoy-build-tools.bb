SUMMARY = "Bazel toolchains for Envoy and UDPA build ecosystem"
DESCRIPTION = "envoy-build-tools is the project which contains custom Bazel toolchains which \
define the compiler flags for Envoy."
LICENSE = "Apache-2.0"

PV = "20191023"

RPM_NAME = "envoy-build-tools-20191023-1.10.noarch.rpm"
RPM_HASH = "2c870d49db8805930deafcb28e795278a5b5948860266e0996a4567ef3acc785f102af573056b9a081fbd2e93190a90fb1fda8642bbd72b9b70ee02a786ad208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "envoy-build-tools"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm

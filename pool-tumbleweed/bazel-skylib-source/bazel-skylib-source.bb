SUMMARY = "Source code of bazel-skylib"
DESCRIPTION = "Skylib is a standard library that provides functions for manipulating \
collections, file paths, and common features for writing custom build rules in \
Bazel. \
 \
This package contains source code of Skylib."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "bazel-skylib-source-1.0.3-2.6.noarch.rpm"
RPM_HASH = "8176d94e0df8ff36caa9a5f6f987d790dffe12817327109f50eb991760e737ea9bd9164248f2030f509302da3666a480c2bd03b2f79c5f6558f02d3211fda6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-skylib-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

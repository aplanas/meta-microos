SUMMARY = "Source code of bazel-apple-support"
DESCRIPTION = "Set of helper methods for Bazel that support building rules for Apple platforms. \
 \
This package contains source code for bazel-apple-support."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "bazel-apple-support-source-0.7.1-1.10.noarch.rpm"
RPM_HASH = "bb4918d6febd0c0d955cf0ebc6be11505f692e09da0049045c75740e288a575ecf7d28621e3e09e071f303cab0a31f746d1044457a514331ffd6fd711208a71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-apple-support-source"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

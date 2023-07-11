SUMMARY = "Source code of bazel-rules-pkg"
DESCRIPTION = "Bazel rules for building tar, zip, deb, and rpm for packages. \
 \
This package contains source code for bazel-rules-pkg."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "bazel-rules-pkg-source-0.7.0-1.1.noarch.rpm"
RPM_HASH = "2acecea55b5fb04d1a50a876ff4cc782466e74ed87af0900abf2266e4790b7851e7177e232f25041e83ab22937b516a5ca193ff4bd35d308056c8c7284fb8e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-pkg-source"

RDEPENDS:${PN} += ""

inherit rpm

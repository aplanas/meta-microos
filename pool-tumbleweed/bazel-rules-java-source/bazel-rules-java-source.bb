SUMMARY = "Source code of bazel-rules-java"
DESCRIPTION = "Bazel rules which support building software written in Java. \
 \
This package contains source code of bazel-rules-java."
LICENSE = "Apache-2.0"

PV = "20190628"

RPM_NAME = "bazel-rules-java-source-20190628-1.10.noarch.rpm"
RPM_HASH = "e1c8819012171ea3391b044fef6b131e750cf3f7f2891e45b406c600bd1a1c5219da32f026158c62d79c7a47e450a7ab4e792182fb4bda5b55ce8c4ff1b24008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-java-source"

RDEPENDS:${PN} += ""

inherit rpm

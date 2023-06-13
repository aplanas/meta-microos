SUMMARY = "Source code of bazel-rules-apple"
DESCRIPTION = "Bazel rules to build software for Apple platforms. \
 \
This package contains source code for bazel-rules-apple."
LICENSE = "Apache-2.0"

PV = "0.32.0"

RPM_NAME = "bazel-rules-apple-0_32-source-0.32.0-1.1.noarch.rpm"
RPM_HASH = "6e417d8a6e99fdd0abd67f889225df4c270906b8a18031bb551d0aa6f436ec26b256c4084294fdf819d989d10741460271419b0ecab56a174a15433025921570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-apple-0_32-source"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3"

inherit rpm

SUMMARY = "Source code of bazel-rules-apple"
DESCRIPTION = "Bazel rules to build software for Apple platforms. \
 \
This package contains source code for bazel-rules-apple."
LICENSE = "Apache-2.0"

PV = "20190827"

RPM_NAME = "bazel-rules-apple-source-20190827-1.10.noarch.rpm"
RPM_HASH = "9a0afa5434c5cb79043a8563baa61b3bbd5e50a1ae06f916c02d5331c3fa3ada0893913c0b3bd02459a497462933d7b71a79b1fa3b19ddd2ecf4d9312901c55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-apple-source"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm

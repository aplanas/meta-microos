SUMMARY = "Source code of bazel-rules-swift"
DESCRIPTION = "Bazel rules which support building software written in Swift. \
 \
This package contains source code of bazel-rules-swift."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "bazel-rules-swift-source-0.13.0-1.10.noarch.rpm"
RPM_HASH = "34bd4a1d467276d3de19297157b75894e8f916807e5209141b80ba14324604d43f1ccf88722021335d043563fcd2152d2e98cca37e7d56cba03680bd7cba010b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-swift-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

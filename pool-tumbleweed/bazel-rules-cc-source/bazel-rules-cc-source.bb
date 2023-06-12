SUMMARY = "Source code of bazel-rules-cc"
DESCRIPTION = "Bazel rules which support building software written in C++. \
 \
This package contains source code of bazel-rules-cc."
LICENSE = "Apache-2.0"

PV = "20190722"

RPM_NAME = "bazel-rules-cc-source-20190722-1.10.noarch.rpm"
RPM_HASH = "379967f4f3128058647ac9cecfd170fe76aa6bffb1f63c21ec6daf20920570415ec7e3d1fe50bec0d98eaecf45c966c0d0af0ed4a1a43584bb45dd25db9c8f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-cc-source"
RDEPENDS:${PN} += ""

inherit rpm

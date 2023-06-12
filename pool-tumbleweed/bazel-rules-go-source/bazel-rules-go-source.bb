SUMMARY = "Source code of bazel-rules-go"
DESCRIPTION = "Bazel rules which support building software written in Go, specifically: \
- building libraries \
- building binaries \
- executing tests \
- vendoring \
- cgo builds \
- cross compilation \
- auto generating Bazel BUILD files \
- build-time code analysis via nogo \
 \
This package contains source code of bazel-rules-go."
LICENSE = "Apache-2.0"

PV = "0.20.3"

RPM_NAME = "bazel-rules-go-source-0.20.3-2.6.noarch.rpm"
RPM_HASH = "3ddff5f929903fa4a8fdfeeac910c34880000b0eac6d811195a83e90ab70fc34def41f507f1157e540f771cf0c30f473743ea03354d5b6174200758bdfd3c8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-go-source"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3"

inherit rpm

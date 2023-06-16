SUMMARY = "Source code of bazel-rules-python"
DESCRIPTION = "Bazel rules for packaging and distributing software written in Python. \
 \
This package contains source code of bazel-rules-python."
LICENSE = "Apache-2.0"

PV = "0.0.1"

RPM_NAME = "bazel-rules-python-source-0.0.1-1.9.noarch.rpm"
RPM_HASH = "ab5bd23f4964f283d1e805650a3f22375d3c0d6f46a8d6c354ccaba75dc5986bcb36edcd003b8a160f3a877a5d108cb4d4ca6bd81d059b54fd008d76b5c7ee19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-python-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

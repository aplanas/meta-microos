SUMMARY = "Source code of bazel-rules-foreign-cc"
DESCRIPTION = "Rules for building C/C++ projects using foreign build systems inside Bazel \
projects. \
 \
This package contains source code of bazel-rules-foreign-cc."
LICENSE = "Apache-2.0"

PV = "20190926"

RPM_NAME = "bazel-rules-foreign-cc-source-20190926-1.10.noarch.rpm"
RPM_HASH = "2673768084f5d2ad13787ab76d322845fc74e8ac7dd155d51b5b877f2e82ad52c3c830d3db204c5ba78bbb6746e0839bd7a4e1ac07b7d584424aee254c5ef937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-foreign-cc-source"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

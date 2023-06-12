SUMMARY = "Source code of bazel-rules-android"
DESCRIPTION = "Bazel rules to build software for Android. \
 \
This package contains source code of bazel-rules-android."
LICENSE = "Apache-2.0"

PV = "0.1.1"

RPM_NAME = "bazel-rules-android-source-0.1.1-1.6.noarch.rpm"
RPM_HASH = "430661ba5bef205b0c235b7d684856e2c31c0ddf614534e1add8c8fca37e2c1c78f36637721c3f400e96c5935d75b643090d760777ec3db6da81c1014bb563b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-android-source"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Source code of bazel-rules-apple"
DESCRIPTION = "Bazel rules to build software using Android NDK. \
 \
This package contains source code for bazel-rules-android-ndk."
LICENSE = "Apache-2.0"

PV = "20220902"

RPM_NAME = "bazel-rules-android-ndk-source-20220902-1.1.noarch.rpm"
RPM_HASH = "c11e207fbaf16e63894dce2524c77c93fd4615f682f7112b9a283e3e582eb9c0ae4f85bb65419f50c6e2ed6aea5bb64f49d27bca5bff2dae30ac0ecad97870a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-android-ndk-source"

RDEPENDS:${PN} += ""

inherit rpm

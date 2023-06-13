SUMMARY = "Build environment for the KDE PIM MIME libraries"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmime-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f40b9f50c508f404db85fc15e3e12015e6db2bbcc8ac747de4f73a9925e2ff132c9082ab0d9153b7fef39d97c38828a97f78fd1d66efc46b0610831699c66255"

RPROVIDES:${PN} += "cmake(KF5Mime) \
cmake(KPim5Mime) \
kmime-devel \
kmime-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5Codecs) \
libKPim5Mime5"

inherit rpm

SUMMARY = "Javadoc for jakarta-commons-launcher"
DESCRIPTION = "Commons-launcher eliminates the need for a batch or shell script to \
launch a Java class. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Launcher Package."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "jakarta-commons-launcher-javadoc-1.1-25.6.noarch.rpm"
RPM_HASH = "994ee2434b6af3ad4b778d2bcb8321ea94176f2b4ad806f0ed9bd248c99bd622e0b5543e864ea8aec06090f367f55377a0f42b03c9e1c70e2e06b009b254edee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-launcher-javadoc"
RDEPENDS:${PN} += "coreutils"

inherit rpm

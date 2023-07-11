SUMMARY = "Javadoc for native-platform"
DESCRIPTION = "This package contains javadoc for native-platform."
LICENSE = "Apache-2.0"

PV = "0.14"

RPM_NAME = "native-platform-javadoc-0.14-2.10.noarch.rpm"
RPM_HASH = "31102c3c056efcc283d5176676dc0c43261ed3e6fea4d1bc3752a47cff44bb519ed9fcd35d0f705d76fafbc684098011fb6eda90850af9c84fd8702eb18d31ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "native-platform-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

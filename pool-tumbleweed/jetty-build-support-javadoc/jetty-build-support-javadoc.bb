SUMMARY = "API documentation for jetty-build-support"
DESCRIPTION = "API documentation for jetty-build-support."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.5"

RPM_NAME = "jetty-build-support-javadoc-1.5-2.10.noarch.rpm"
RPM_HASH = "f6adb72d0999eaf57b26f94e0d5087cc6c9129d0b0990e5aad3ca4d17d7f272d33702e533c7531b8179d70121857a5e5a6d98c4dc04aaa3d99d3cdeaf10dfb45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-build-support-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for plexus-interpolation"
DESCRIPTION = "API documentation for plexus-interpolation."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "1.26"

RPM_NAME = "plexus-interpolation-javadoc-1.26-2.6.noarch.rpm"
RPM_HASH = "6c56f723a4b9b0f5be138ba4cefc54afdafba026261a988601c4c8779db555106799212be5c089b28c1d501e3c6fadcf4c0a138abca428555650f38f8bfa4d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-interpolation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

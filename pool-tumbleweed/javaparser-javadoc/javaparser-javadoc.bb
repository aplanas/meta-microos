SUMMARY = "Javadoc for javaparser"
DESCRIPTION = "This package contains API documentation for javaparser."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.5"

RPM_NAME = "javaparser-javadoc-3.25.5-2.1.noarch.rpm"
RPM_HASH = "2419fe75da93d7a8fa310fc7ceacc29da88a770175c63f883c143a9d97876d0bd5e62020c1748ace4200e3f4dceb906c18fdfa33274ae946733250ed29c9251a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

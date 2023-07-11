SUMMARY = "Javadoc for jackson-annotations"
DESCRIPTION = "This package contains API documentation for jackson-annotations."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-annotations-javadoc-2.13.3-1.4.noarch.rpm"
RPM_HASH = "bdbe5a8e861efd599786c9eb0d9885b38636ecb8e23fe5eedd7588a736e1d374313aa4003e702cc840911fc3eb1b09dbfa58641cd09851fc13e1a8c37489ef98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

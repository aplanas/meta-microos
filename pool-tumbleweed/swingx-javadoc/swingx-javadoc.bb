SUMMARY = "Javadoc for swingx"
DESCRIPTION = "This package contains the API documentation for swingx."
LICENSE = "LGPL-2.0-only"

PV = "1.6.5.1"

RPM_NAME = "swingx-javadoc-1.6.5.1-1.11.noarch.rpm"
RPM_HASH = "f8cc6f9ee20f6980669b6ae10bf00e406d410e388635da9d0e51ea63433e70b5d06c7ad6c863d5e8a132b055868ac960e3f7d0f1ac30fc1739c6f923779e6854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swingx-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

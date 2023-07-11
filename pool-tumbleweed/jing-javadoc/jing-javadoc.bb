SUMMARY = "Javadoc API documentation for Jing"
DESCRIPTION = "Javadoc API documentation for Jing."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-javadoc-20220510-3.2.noarch.rpm"
RPM_HASH = "d53b78a205b0123191ad9ea09f7462d391e1e081ffbed480999bfd8c3098d538d0aaf97adabaaa49551c50afe49cb814f665a27285e793765ebb40c7922ae67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

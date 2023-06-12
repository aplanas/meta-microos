SUMMARY = "Javadoc for tiger-types"
DESCRIPTION = "This package contains javadoc for tiger-types."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-javadoc-2.2-4.10.noarch.rpm"
RPM_HASH = "63e18b0af4d1e8014ada024194fe188edf77ac682fd33820d2f9530d9d061e6c690a2bb6be8342705f653aee331b587c491860e8de2733144c520ccd44951bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiger-types-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

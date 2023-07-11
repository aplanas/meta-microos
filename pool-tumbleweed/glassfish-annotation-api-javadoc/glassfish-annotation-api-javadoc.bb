SUMMARY = "Javadoc for glassfish-annotation-api"
DESCRIPTION = "This package contains javadoc for glassfish-annotation-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3.2"

RPM_NAME = "glassfish-annotation-api-javadoc-1.3.2-3.7.noarch.rpm"
RPM_HASH = "2701c6589ebce6364466aa2d13740e13f9d33bcf63b573d10d0029740543896cf7de96f3be7d6db8df2d556f13c945c18dc9618bc47491194819456bed8730ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-annotation-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

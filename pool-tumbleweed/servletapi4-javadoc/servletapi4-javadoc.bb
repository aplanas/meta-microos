SUMMARY = "Javadoc for servletapi4"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet). This package \
contains the javadoc documentation for the Java Servlet and JSP APIs."
LICENSE = "Apache-1.1"

PV = "4.0.4"

RPM_NAME = "servletapi4-javadoc-4.0.4-300.7.noarch.rpm"
RPM_HASH = "ea8170d27a6af1f6b20ae274c6f21c7408c41c0e6ee2252db8aa348c7781a6f74efbcfa75dc65a26b0a4ec6f1b195a281252498e8bcc578f75827b3cccba16b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servletapi4-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

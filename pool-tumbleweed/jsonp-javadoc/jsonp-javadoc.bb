SUMMARY = "Javadoc for jsonp"
DESCRIPTION = "This package contains javadoc for jsonp."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.4"

RPM_NAME = "jsonp-javadoc-1.0.4-4.1.noarch.rpm"
RPM_HASH = "4e716dce12eb6a07481fe4aea653878ec507732ac1a37cec3629f980635cb105b0a3734a1877f59be54ad6ce53aa54dd692fc6280949619bf9a16bb7271ef310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsonp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

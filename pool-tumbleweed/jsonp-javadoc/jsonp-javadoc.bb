SUMMARY = "Javadoc for jsonp"
DESCRIPTION = "This package contains javadoc for jsonp."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.4"

RPM_NAME = "jsonp-javadoc-1.0.4-3.10.noarch.rpm"
RPM_HASH = "69bfd526c6c8ecea8ff1da551d1d912c8bb98fd294ed938e3a6bd9b8ac1f0467dfd085eaf15d20d45e763d3f4451dc8d5a7a31802d38efdf8f0304a4eea7fa96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsonp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "API Documentation for groovy18"
DESCRIPTION = "JavaDoc documentation for groovy18"
LICENSE = "Apache-2.0"

PV = "1.8.9"

RPM_NAME = "groovy18-javadoc-1.8.9-7.8.noarch.rpm"
RPM_HASH = "704b2b692518d52e75c2f186ba7c17867e655a411018e42afcb18221c65527084d90e898ef1d5cf42c247c540dba7054b7c05ba66319afef8a9a903942ef28ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groovy18-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

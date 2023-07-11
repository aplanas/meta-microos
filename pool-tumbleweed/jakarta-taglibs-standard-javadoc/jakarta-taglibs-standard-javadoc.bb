SUMMARY = "Javadoc for jakarta-taglibs-standard"
DESCRIPTION = "This package contains the javadoc documentation for Jakarta Taglibs."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "jakarta-taglibs-standard-javadoc-1.1.2-2.7.noarch.rpm"
RPM_HASH = "f42d93926aa525eb9055f72296a3019a19401f0ac2a9d9639678101d454f067cec879e192447654723a5c441eb0c2d77f6081020072e231fbfbd3cb48d3fc3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-taglibs-standard-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

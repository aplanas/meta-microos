SUMMARY = "Javadoc for jeromq"
DESCRIPTION = "This package contains the API documentation for jeromq."
LICENSE = "MPL-2.0+"

PV = "0.5.2"

RPM_NAME = "jeromq-javadoc-0.5.2-1.8.noarch.rpm"
RPM_HASH = "f53c42d90028aafd78ddbbdc66e135d927c76d59a10280255535bf48ea7c3e1372fabaf04f5bf7c56a971bacbd00164a7a70c8cdfee832bf07238802da59bea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

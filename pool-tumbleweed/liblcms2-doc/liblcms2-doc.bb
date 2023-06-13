SUMMARY = "User and developer documentation for lcms2"
DESCRIPTION = "This package contains user and developer documentation for lcms2."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "liblcms2-doc-2.15-1.1.noarch.rpm"
RPM_HASH = "946fb94cd269bb649ebe1d726f9d48797ed552162110ca7608e5a8a1e37cb893e50bebc7be09650d104fc3515aa15302e22828ec32ccc71c7a16d552f53f7b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblcms2-doc"

RDEPENDS:${PN} += ""

inherit rpm

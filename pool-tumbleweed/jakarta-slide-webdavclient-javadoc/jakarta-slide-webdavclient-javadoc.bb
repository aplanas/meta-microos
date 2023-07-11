SUMMARY = "Slide WebDAV client"
DESCRIPTION = "Slide includes a fully featured WebDAV client library and command line \
client."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "jakarta-slide-webdavclient-javadoc-2.1-27.10.noarch.rpm"
RPM_HASH = "9ed2b8af261c1529b9d24dd57f68a46688dcf9725f84c6532e3e0adf68a41ec1fda30ebb7231390cda11052f11c5f65435600fdddc9a232ecaa691f12682913e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-slide-webdavclient-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

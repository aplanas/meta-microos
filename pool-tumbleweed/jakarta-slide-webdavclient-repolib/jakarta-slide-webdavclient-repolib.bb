SUMMARY = "Slide WebDAV client"
DESCRIPTION = "Slide includes a fully featured WebDAV client library and command line \
client."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "jakarta-slide-webdavclient-repolib-2.1-27.10.noarch.rpm"
RPM_HASH = "154c5877d16149568a3084b0566f76b895f3886d29b1c50e0d900770aebdb95d031d987d5df04fa1cc2bd8434f2ff7c63f4e694c550122f707f56df96780f77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-slide-webdavclient-repolib"

RDEPENDS:${PN} += ""

inherit rpm

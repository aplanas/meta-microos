SUMMARY = "Slide WebDAV client"
DESCRIPTION = "Slide includes a fully featured WebDAV client library and command line \
client."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "jakarta-slide-webdavclient-repolib-2.1-27.9.noarch.rpm"
RPM_HASH = "4677cf15f6e7b29648642892f7c9817112f1e5926a8186febbedd95be282166734b53bc2f1274f2b212396dccaad1fd9bf8c0f10f4050768dc46949fc6352e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-slide-webdavclient-repolib"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python310-lazr.uri-1.0.6-1.8.noarch.rpm"
RPM_HASH = "542e94bf246123ac6690fe6c0002027971459eb077f3f4a9cc5e97e063644a0b81ac435c97e72bc36f3074558c42b57bf9dd999c5b6a9af6e8dc149a02f99dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.uri \
python3.10dist(lazr.uri) \
python310-lazr.uri \
python3dist(lazr.uri)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

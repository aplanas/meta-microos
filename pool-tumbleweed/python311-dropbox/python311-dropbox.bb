SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "10.4.1"

RPM_NAME = "python311-dropbox-10.4.1-2.10.noarch.rpm"
RPM_HASH = "4974d2ac8b9a849aaee2616b1da86902198f72a2423703174f9104a17b2013122d1f58faf1c5f616bf195dba40a8d730dfb8c51378e59762407d8fc7918ffd97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dropbox \
python3.11dist-dropbox \
python311-dropbox \
python3dist-dropbox"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm

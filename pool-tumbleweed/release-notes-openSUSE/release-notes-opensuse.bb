SUMMARY = "Release Notes for openSUSE"
DESCRIPTION = "This package contains the release notes with the most important changes \
for openSUSE Tumbleweed."
LICENSE = "GFDL-1.3"

PV = "84.87.20180228.827b030"

RPM_NAME = "release-notes-openSUSE-84.87.20180228.827b030-1.42.noarch.rpm"
RPM_HASH = "58059325e99724551f70f7cac4d5a2df77b4804c14124536391b87f9a678f7f4a1d3c5df837bf87dbd421efd8790b0a7eb1de315a6a24f201fe514675b3208c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-notes \
release-notes-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm

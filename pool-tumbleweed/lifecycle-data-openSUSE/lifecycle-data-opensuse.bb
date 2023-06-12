SUMMARY = "End of life dates for specific packages"
DESCRIPTION = "Package lifecycle data.  This is the source of zypper lifecycle information."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "lifecycle-data-openSUSE-1-5.11.noarch.rpm"
RPM_HASH = "e60afe4a3d2d63af57ef1dc0ce7dd9e0a49e04e669f70a56da158e719df94dca47203f0fdb1071820eb646b773fec22f004569eeec6af918fcfeda1843feaf25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lifecycle-data-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm

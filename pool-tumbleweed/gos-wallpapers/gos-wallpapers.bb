SUMMARY = "Good Old SUSE Wallpapers"
DESCRIPTION = "This package contains wallpapers from older SUSE releases."
LICENSE = "GPL-2.0+"

PV = "2010"

RPM_NAME = "gos-wallpapers-2010-17.16.noarch.rpm"
RPM_HASH = "2aa2a9ae13fc2d51e1fe83bf17c3b9efe17b3b96a0ce058bcae672ec3bcf2a9fd5acd252d36b0910dad560930ce3676ce52bbabc327a68c0989e279f3f5bb2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gos-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm

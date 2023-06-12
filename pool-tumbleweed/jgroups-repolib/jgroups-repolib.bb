SUMMARY = "Artifacts to be uploaded to a repository library"
DESCRIPTION = "Artifacts to be uploaded to a repository library. \
This package is not meant to be installed but so its contents \
can be extracted through rpm2cpio"
LICENSE = "LGPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "jgroups-repolib-2.6.10-33.9.noarch.rpm"
RPM_HASH = "72b598b6ba105a12e32c9e72683e1ffeac6ac51f0ca4118765cfda01895635b16de89e29d362e95830c64ec1cf64942eafceb155bb75be17b7a1852afebba1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgroups-repolib"
RDEPENDS:${PN} += ""

inherit rpm

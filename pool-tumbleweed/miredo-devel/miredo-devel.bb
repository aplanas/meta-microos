SUMMARY = "Header files, libraries and development documentation for miredo"
DESCRIPTION = "This package contains the header files, development libraries and development \
documentation for miredo. If you would like to develop programs using miredo, \
you will need to install miredo-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-devel-1.2.6-5.8.aarch64.rpm"
RPM_HASH = "45f1d34fdfec800a99386b61af00a8ce63cc9277a19d765ddf25acbf3fe947af249d05e2268b0f432269ec6c1c7c0f7a748b0f54bdbee3818e20bc183834b4f1"

RPROVIDES:${PN} += "miredo-devel"

RDEPENDS:${PN} += "miredo-common"

inherit rpm

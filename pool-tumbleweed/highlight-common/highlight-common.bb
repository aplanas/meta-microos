SUMMARY = "Common architecture-independent files for highlight"
DESCRIPTION = "This package provides some architecture-independent files for highlight such as \
configuration and themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-common-4.8-1.1.noarch.rpm"
RPM_HASH = "66cadb3687ffdab3b4020994d8c70445e024f45e5a182f4ef6d1d9615eb81d9f7e8ba7a4daf054c83cfcec0e138398a47b48fe99a31df49bc735c8a9080da6f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-highlight-common \
highlight-common"

RDEPENDS:${PN} += ""

inherit rpm

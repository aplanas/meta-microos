SUMMARY = "Common architecture-independent files for highlight"
DESCRIPTION = "This package provides some architecture-independent files for highlight such as \
configuration and themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-common-4.7-1.1.noarch.rpm"
RPM_HASH = "aa245e487a0e6ebb7376c9f19fe1e0a6eee422dcca4f54893443952cba667b798ea3b8e06d3ac0f532576706615fd7087b4058de77d1dd093d543c1ce172a547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-highlight-common \
highlight-common"

RDEPENDS:${PN} += ""

inherit rpm

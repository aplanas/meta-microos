SUMMARY = "Common architecture-independent files for highlight"
DESCRIPTION = "This package provides some architecture-independent files for highlight such as \
configuration and themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-common-4.6-1.1.noarch.rpm"
RPM_HASH = "19293f9f1a7ca68356990ebc7c1f1b6df226d1522b823518c56e64429ca3df43bc47aafa4037a0b8e506d6189262c4323908d8d07d576c5f2a233b0c59a74024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(highlight-common) \
highlight-common"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "mednafen-doc-1.31.0-1.4.noarch.rpm"
RPM_HASH = "682256fae07c0f06bd8c4622c1e544c27fd7a6d70039969138114dd3feaf467c96e4f604d62d5367b2dfde8f6436e894b4a02d8a911dbba55cdc9fcfa0ee2129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mednafen-doc"

RDEPENDS:${PN} += ""

inherit rpm

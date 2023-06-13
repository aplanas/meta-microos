SUMMARY = "osloversionedobjects library - Documentation"
DESCRIPTION = "This package contains documentation files for python-oslo.versionedobjects."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python-oslo.versionedobjects-doc-3.1.0-1.2.noarch.rpm"
RPM_HASH = "c212455ab7b01fa164b9f0d8e15f828376f2fc3f49f8d833954c37b2e20a375d45f4f6bf48af2e7a45e7dc7ed271542104d27171ffc294cd56fccf0162d96f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.versionedobjects-doc"

RDEPENDS:${PN} += ""

inherit rpm

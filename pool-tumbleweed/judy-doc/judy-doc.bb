SUMMARY = "Development files for Judy"
DESCRIPTION = "This package contains documentation about Judy library and examples."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "judy-doc-1.0.5-10.12.noarch.rpm"
RPM_HASH = "96014624acffe66b6cdc96860ca3e352e4c5367b960603555edf92414919aeae3648759704d1e225d30e523aa453747128cee300576edc7f55392e7355911fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "judy-doc"

RDEPENDS:${PN} += ""

inherit rpm

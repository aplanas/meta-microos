SUMMARY = "A set of backgrounds packaged with the MATE desktop"
DESCRIPTION = "This is a collection of desktop wallpapers created with MATE users \
in mind."
LICENSE = "GPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "mate-backgrounds-1.26.0-2.5.noarch.rpm"
RPM_HASH = "c83e05e730b94fd507322f034a29889edf486b97435aa02acd59eb6aea3fa67bf2e48b5eac8e44a062cfd360ff0cbe6051d0914a7ed1702ee5b866c90b5aa5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-backgrounds"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Fish Completion for kubernetes1.26-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.26-client."
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-client-fish-completion-1.26.6-1.1.noarch.rpm"
RPM_HASH = "e35d16d25f9d7fd117bead94ececadff94aaef39b84f3b62e1aab24fcc687a92054c1c533c8212c297eef7ae11784f65e12b431d7c65906fd4f31689ce11b6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.26-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.26-client"

inherit rpm

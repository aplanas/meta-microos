SUMMARY = "Documentation for libaccounts-qt"
DESCRIPTION = "This package contains the documentation for the accounts-qt library."
LICENSE = "LGPL-2.1-only"

PV = "1.16"

RPM_NAME = "libaccounts-qt5-doc-1.16-1.19.noarch.rpm"
RPM_HASH = "a19afb5a6c04c3d1bf2f08d314676bacaedb2661c446a584655915622d9fa48eaec85eda9715d27d3971b53a3f13726deda8ea7f820ca7fd85d6a8e4fe70c442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaccounts-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm

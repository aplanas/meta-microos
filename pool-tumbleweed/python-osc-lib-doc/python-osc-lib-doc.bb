SUMMARY = "Documentation for the OpenStack client library"
DESCRIPTION = "Documentation for the OpenStack client library."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python-osc-lib-doc-2.7.0-1.2.noarch.rpm"
RPM_HASH = "41ef5b7f27aebf18e73ff8ebd9248a952e08d523fab3cfd83667afa4621c3ee4cc70c48fdf6753455b25b21b7ec5ab5406a6d6ce174bb064cdff6f282251f724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-osc-lib-doc"

RDEPENDS:${PN} += ""

inherit rpm

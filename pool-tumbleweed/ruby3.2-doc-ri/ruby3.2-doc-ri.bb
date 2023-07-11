SUMMARY = "Ruby Interactive Documentation"
DESCRIPTION = "This package contains the RI docs for ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-doc-ri-3.2.2-1.2.noarch.rpm"
RPM_HASH = "f5d22de1e705c18df8a668063eca2e26078a6832a27da0cfa593f90bcc5712fe39e576dcd81a0a33a116e378a52773acaa8fa3ffa1b0297c543a253aa709ea53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby3.2-doc-ri"

RDEPENDS:${PN} += "ruby3.2"

inherit rpm

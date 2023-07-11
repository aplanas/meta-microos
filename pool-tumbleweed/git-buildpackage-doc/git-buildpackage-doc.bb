SUMMARY = "Documentation for the git-buildpackage suite"
DESCRIPTION = "This package contains documentation for the git-buildpackage suite - both the \
Debian and the RPM tool set."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-doc-0.9.23-1.3.noarch.rpm"
RPM_HASH = "8c480df88431ced41270904c855d8cba18c0e68834bc731ce9e2cc1659ffbb09ca6410a4535446d64bd06be392568d48c1a5ceab319e9222a9bd30b2c107dac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage-doc"

RDEPENDS:${PN} += ""

inherit rpm

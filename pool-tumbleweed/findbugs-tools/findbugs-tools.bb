SUMMARY = "Addon tools for findbugs"
DESCRIPTION = "This package contains additional tools for use with findbugs.  See \
README.tools for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "findbugs-tools-3.0.1-2.20.noarch.rpm"
RPM_HASH = "59f0e20b0252378201e83c23a65d622baacab7644935937010c3c8110fbd8c57c7dcdd5f697b30801be23f6683a28d1f506becdec191aa890dfa02793b33ebe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-tools"

RDEPENDS:${PN} += "findbugs \
junit"

inherit rpm

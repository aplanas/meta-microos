SUMMARY = "Documentation for texlive-dsserif"
DESCRIPTION = "This package includes the documentation for texlive-dsserif"
LICENSE = "OFL-1.1"

PV = "2023.209.1.031svn60898"

RPM_NAME = "texlive-dsserif-doc-2023.209.1.031svn60898-53.1.noarch.rpm"
RPM_HASH = "8bc6aaa0f3f9ad7ec2d2de56bc09c1c8880ec73b2524c46fc1e3fc7ae5be22a0f8e9ac40b713cc2ac2385e4abc235ea031446d8d759ae9760d4f46488f7718d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dsserif-doc"

RDEPENDS:${PN} += ""

inherit rpm

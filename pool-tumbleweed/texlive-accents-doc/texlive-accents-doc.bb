SUMMARY = "Documentation for texlive-accents"
DESCRIPTION = "This package includes the documentation for texlive-accents"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn51497"

RPM_NAME = "texlive-accents-doc-2023.209.1.4svn51497-55.1.noarch.rpm"
RPM_HASH = "c79ee3bd922e4e9d50ce48735fc2962212fdbc90387f7eef119df40818a6ca41b782500b5a4f961a40eab50fdab06abe5275b9e670fc9f5fa8ee8550163fc300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accents-doc"

RDEPENDS:${PN} += ""

inherit rpm

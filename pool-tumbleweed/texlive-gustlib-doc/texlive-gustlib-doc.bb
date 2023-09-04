SUMMARY = "Documentation for texlive-gustlib"
DESCRIPTION = "This package includes the documentation for texlive-gustlib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-gustlib-doc-2023.209.svn54074-54.2.noarch.rpm"
RPM_HASH = "b10dbfb3b9a586d3686daa16393a9b8a9ebfef938950c14b6fa1587a77eb4b9fa98b513a0b72d0ec2e84927fffeb0befd6166729306c532022413aefa5791b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustlib-doc"

RDEPENDS:${PN} += ""

inherit rpm

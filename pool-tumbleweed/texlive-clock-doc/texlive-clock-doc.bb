SUMMARY = "Documentation for texlive-clock"
DESCRIPTION = "This package includes the documentation for texlive-clock"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-clock-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "dd0ef22fc78d436e46a76d2ac8ad2ebb3d10201f001b5afa85b632b8333c63117b13773b2fa5305bcc3008c8a45dbf3a10bf3c0023e2002b958f8f18ec09f318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clock-doc"

RDEPENDS:${PN} += ""

inherit rpm

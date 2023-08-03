SUMMARY = "Documentation for texlive-universalis"
DESCRIPTION = "This package includes the documentation for texlive-universalis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64505"

RPM_NAME = "texlive-universalis-doc-2023.209.svn64505-54.1.noarch.rpm"
RPM_HASH = "4224940437475d677cb9688413fd979786b32e5baee3161c171535e58ce5087939821e467a548529c10616e68e5976a1d8288e500d28a90791188b2e129dae8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-universalis-doc"

RDEPENDS:${PN} += ""

inherit rpm

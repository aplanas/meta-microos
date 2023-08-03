SUMMARY = "Documentation for texlive-texdate"
DESCRIPTION = "This package includes the documentation for texlive-texdate"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn49362"

RPM_NAME = "texlive-texdate-doc-2023.209.2.0svn49362-55.1.noarch.rpm"
RPM_HASH = "ce071d4b3494fb23fd36858706c55bb715e2791b192fb3903889e4371e6ddfeaba22ce97a43dceb0269e8d990831c0a55ef28c835347add5b3ff54a325bca879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdate-doc"

RDEPENDS:${PN} += ""

inherit rpm

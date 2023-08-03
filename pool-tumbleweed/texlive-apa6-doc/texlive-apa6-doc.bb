SUMMARY = "Documentation for texlive-apa6"
DESCRIPTION = "This package includes the documentation for texlive-apa6"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.34svn53406"

RPM_NAME = "texlive-apa6-doc-2023.209.2.34svn53406-55.1.noarch.rpm"
RPM_HASH = "bc1cf69af61dfdbbae20283564e9129d55f706486855d32d8963d28125ab619d0b24fd3f8ea78a2cfc873f56d21f391595a27cea81bdfc4186c2491f2fd9f88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa6-doc"

RDEPENDS:${PN} += ""

inherit rpm

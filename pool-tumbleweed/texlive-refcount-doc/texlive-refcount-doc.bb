SUMMARY = "Documentation for texlive-refcount"
DESCRIPTION = "This package includes the documentation for texlive-refcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn53164"

RPM_NAME = "texlive-refcount-doc-2023.209.3.6svn53164-54.2.noarch.rpm"
RPM_HASH = "8356c8ebadfc989eb568d3bb42a86faa17145c25e2e67b76e0b44ac9a5bcaedc4ecaa0d2a3439f851fe065a5e2a45f6cdf7d663def73abb551dd9383977281e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcount-doc"

RDEPENDS:${PN} += ""

inherit rpm

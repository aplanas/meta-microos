SUMMARY = "Documentation for texlive-biblatex-ext"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ext"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.16svn63638"

RPM_NAME = "texlive-biblatex-ext-doc-2023.201.0.0.16svn63638-53.1.noarch.rpm"
RPM_HASH = "224dc51ec48356ede5224586bd47f87c9649de1bb15742fef64d08f3e56b90134f71bb9fa8f21078fd847abbce4e2787a0d83c71b2827512c2e09604b2c8e411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm

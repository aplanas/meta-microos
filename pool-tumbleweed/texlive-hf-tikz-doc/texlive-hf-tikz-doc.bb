SUMMARY = "Documentation for texlive-hf-tikz"
DESCRIPTION = "This package includes the documentation for texlive-hf-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-doc-2023.209.0.0.3asvn34733-54.2.noarch.rpm"
RPM_HASH = "9067415eb2f31a1b377267bd7d6c55b5599e1649c622af817cfe58aade1e1d8fe1c0b2fb5b81fdf0e41b7e4c962e123723bf4f17cf77e4f8c6e28f21f48eedd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hf-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm

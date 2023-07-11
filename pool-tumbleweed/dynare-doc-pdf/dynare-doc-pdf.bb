SUMMARY = "Documentation for dynare in PDF format"
DESCRIPTION = "This package provides documentation for dynare in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "dynare-doc-pdf-5.4-1.2.noarch.rpm"
RPM_HASH = "fd55af3069d8c01dc77d904e315cf96d02b34b22713b47a256a2516bcf9489eee9b4ea9fb78740f089a1d58dddc498d6c02b77d9858a481025d068aadc8d5bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynare-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm

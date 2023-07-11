SUMMARY = "Documentation for texlive-luasseq"
DESCRIPTION = "This package includes the documentation for texlive-luasseq"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65511"

RPM_NAME = "texlive-luasseq-doc-2023.208.svn65511-53.1.noarch.rpm"
RPM_HASH = "75e69568cc151d41233fef62dae64cadb9e0e3a108a140fcb7332215c0572aca19bf0225adaa43efd8d88403403375a3a087a270277fad897d84b988c12647c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luasseq-doc"

RDEPENDS:${PN} += ""

inherit rpm

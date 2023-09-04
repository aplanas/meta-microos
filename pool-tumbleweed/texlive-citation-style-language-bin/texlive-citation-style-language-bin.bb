SUMMARY = "Binary files of citation-style-language"
DESCRIPTION = "Binary files of citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64151"

RPM_NAME = "texlive-citation-style-language-bin-2023.20230311.svn64151-93.2.aarch64.rpm"
RPM_HASH = "b3310092ffa1ecf5f1b1d0cf24b4bb7ea2411e09595108264f82d70b709aab37a2bafc7d902075d8aea155de7110aacddb6ccfef665464a42a3d4c9f44a07730"

RPROVIDES:${PN} += "texlive-citation-style-language-bin"

RDEPENDS:${PN} += "texlive-citation-style-language"

inherit rpm

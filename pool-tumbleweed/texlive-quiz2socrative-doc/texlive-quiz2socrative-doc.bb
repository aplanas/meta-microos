SUMMARY = "Documentation for texlive-quiz2socrative"
DESCRIPTION = "This package includes the documentation for texlive-quiz2socrative"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-doc-2023.209.1.0svn52276-54.1.noarch.rpm"
RPM_HASH = "06c25fb85844021803d1f899188c612e8886155428aa66b42b8afedd5f468435b3e78403c79ee012dde6708da1c7a1e7d311bfeebd9b8a9956a570a8cdaadf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-quiz2socrative-doc-it \
texlive-quiz2socrative-doc"

RDEPENDS:${PN} += ""

inherit rpm

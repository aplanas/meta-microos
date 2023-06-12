SUMMARY = "BibTeX Perl Libraries"
DESCRIPTION = "This package provides BibTeX related Perl libraries by Gerhard \
Gossen, repacked by Boris Veytsman, for TeX Live and other \
TDS-compliant distributions. The libraries are written in pure \
Perl, so should work out of the box on any architecture. They \
have been packaged here mostly for Boris Veytsman's BibTeX \
suite, but can be used in any other Perl script."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn57137"

RPM_NAME = "texlive-bibtexperllibs-2023.201.1.6svn57137-53.1.noarch.rpm"
RPM_HASH = "49ea21eee2a14d417ce4ce07e340578e4b5ef9f21f44647de5349098c1f971391b788c848616fec5982ad71a834b5ad9f5dde5eec417e16bb2d38a498634b6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(BibTeX::Parser) \
perl(BibTeX::Parser::Author) \
perl(BibTeX::Parser::Entry) \
perl(LaTeX::ToUnicode) \
perl(LaTeX::ToUnicode::Tables) \
texlive-bibtexperllibs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
perl(BibTeX::Parser) \
perl(BibTeX::Parser::Author) \
perl(BibTeX::Parser::Entry) \
perl(Exporter) \
perl(LaTeX::ToUnicode) \
perl(LaTeX::ToUnicode::Tables) \
perl(strict) \
perl(utf8) \
perl(warnings) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

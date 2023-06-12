SUMMARY = "Humanities styles for BibLaTeX"
DESCRIPTION = "A small collection of styles for the BibLaTeX package. It was \
designed for citations in the humanities and offers some \
features that are not provided by the standard BibLaTeX styles. \
The styles are dependent on BibLaTeX (at least version 0.9b) \
and cannot be used without it. Eine kleine Sammlung von Stilen \
fur das Paket BibLaTeX. Es ist auf geisteswissenschaftliche \
Zitierweise zugeschnitten und bietet einige Funktionen, die von \
den Standard-Stilen von BibLaTeX nicht direkt bereitgestellt \
werden. Das Paket baut vollstandig auf BibLaTeX auf und kann \
nicht ohne BibLaTeX (mindestens in der Version 0.9b) verwendet \
werden."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7bsvn66579"

RPM_NAME = "texlive-biblatex-dw-2023.201.1.7bsvn66579-53.1.noarch.rpm"
RPM_HASH = "5df6796a9dea6c822e6765f6fd96fe5757ff774bea66dd958126bba9403682a1926184e22a828e10f4708e9dfddf58eecb16fd176944ee1fd0705b2dd544e0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(authortitle-dw.bbx) \
tex(authortitle-dw.cbx) \
tex(english-dw.lbx) \
tex(footnote-dw.bbx) \
tex(footnote-dw.cbx) \
tex(german-dw.lbx) \
tex(standard-dw.bbx) \
tex(standard-dw.cbx) \
texlive-biblatex-dw"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(standard.bbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

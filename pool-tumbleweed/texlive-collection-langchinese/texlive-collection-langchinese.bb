SUMMARY = "Chinese"
DESCRIPTION = "Support for Chinese; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63995"

RPM_NAME = "texlive-collection-langchinese-2023.208.svn63995-60.1.noarch.rpm"
RPM_HASH = "2d096f9f950089148f6a2a7b17f17071e4d494a73d0db23012f4190fde33c40a05a7eb91e84ac2525b1d4ea3eda18077efecf229fceee15ce21f561e82d9bb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langchinese"

RDEPENDS:${PN} += "texlive-arphic \
texlive-arphic-ttf \
texlive-asymptote-by-example-zh-cn \
texlive-asymptote-faq-zh-cn \
texlive-asymptote-manual-zh-cn \
texlive-cns \
texlive-collection-langcjk \
texlive-ctex \
texlive-ctex-faq \
texlive-exam-zh \
texlive-fandol \
texlive-fduthesis \
texlive-hanzibox \
texlive-hyphen-chinese \
texlive-impatient-cn \
texlive-install-latex-guide-zh-cn \
texlive-latex-notes-zh-cn \
texlive-lshort-chinese \
texlive-nanicolle \
texlive-njurepo \
texlive-pgfornament-han \
texlive-qyxf-book \
texlive-texlive-zh-cn \
texlive-texproposal \
texlive-tlmgr-intro-zh-cn \
texlive-upzhkinsoku \
texlive-xpinyin \
texlive-xtuthesis \
texlive-zhlineskip \
texlive-zhlipsum \
texlive-zhmetrics \
texlive-zhmetrics-uptex \
texlive-zhnumber \
texlive-zhspacing"

inherit rpm

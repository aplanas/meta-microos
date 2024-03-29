SUMMARY = "A LaTeX class for bank statements based on csv data"
DESCRIPTION = "More and more banks allow their customers to download posting \
records in various formats. By using the bankstatement class, \
you can create bank statements, as long as a csv format is \
available. At the moment, the csv-mt940 and csv-camt formats -- \
used by many german Sparkassen -- are supported. You can quite \
easily add support for other csv formats. Simply define the \
order of the keys in the csv data file and how to use them. The \
terminology in this class -- such as BIC (Business Identifier \
Code) or IBAN (International Bank Account Number) -- is based \
on usage in the SEPA (Single Euro Payments Area). The user may \
adjust the terminology to suit local needs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.2svn38857"

RPM_NAME = "texlive-bankstatement-2023.209.0.0.9.2svn38857-54.1.noarch.rpm"
RPM_HASH = "760193528bc9343b795c04e78932e139624134a332f6443becce6ec0119795ffba9099dbbb69db3f75ee5c519b8a7b24e3ec9616c8402403df9b4a8fafb1b26a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bankstatement.cls \
tex-csv-camt.def \
tex-csv-mt940.def \
tex-csv-standard-bank-na.def \
tex-stmenglish.def \
tex-stmgerman.def \
tex-stmnamibian.def \
texlive-bankstatement"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-datatool.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xkvltxp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

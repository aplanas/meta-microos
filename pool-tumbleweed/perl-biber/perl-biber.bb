SUMMARY = "Library files of Biber a BibTeX replacement"
DESCRIPTION = "Perl library files of Biber a BibTeX replacement for users of BibLaTeX. \
This package is required by the package texlive-biber-bin."
LICENSE = "LPPL-1.0"

PV = "2.19"

RPM_NAME = "perl-biber-2.19-91.1.noarch.rpm"
RPM_HASH = "815de0eb2fab36670ef7a09fc02c7959fb64dfdb37df412c9c49b933bec5e3a23e40db22ab0b58466b7439303c47b430eea5d3bf1ecfca60baf10df12003f999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Biber \
perl-Biber--Annotation \
perl-Biber--Config \
perl-Biber--Constants \
perl-Biber--DataList \
perl-Biber--DataLists \
perl-Biber--DataModel \
perl-Biber--Date--Format \
perl-Biber--Entries \
perl-Biber--Entry \
perl-Biber--Entry--FieldValue \
perl-Biber--Entry--List \
perl-Biber--Entry--Name \
perl-Biber--Entry--Names \
perl-Biber--Input--file--biblatexml \
perl-Biber--Input--file--bibtex \
perl-Biber--Internals \
perl-Biber--LaTeX--Recode \
perl-Biber--LangTag \
perl-Biber--LangTags \
perl-Biber--Output--base \
perl-Biber--Output--bbl \
perl-Biber--Output--bblxml \
perl-Biber--Output--biblatexml \
perl-Biber--Output--bibtex \
perl-Biber--Output--dot \
perl-Biber--Section \
perl-Biber--Sections \
perl-Biber--UCollate \
perl-Biber--Utils \
perl-biber"

RDEPENDS:${PN} += "perl-Business--ISBN \
perl-Business--ISMN \
perl-Business--ISSN \
perl-Class--Accessor \
perl-Data--Compare \
perl-Data--Dump \
perl-Data--Uniqid \
perl-Date--Simple \
perl-DateTime \
perl-DateTime--Calendar--Julian \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone \
perl-Encode--EUCJPASCII \
perl-Encode--HanExtra \
perl-Encode--JIS2K \
perl-File--Slurp \
perl-File--Slurp--Unicode \
perl-File--Slurper \
perl-IPC--Cmd \
perl-IPC--Run3 \
perl-LWP--Protocol--https \
perl-LWP--Simple \
perl-List--AllUtils \
perl-List--MoreUtils \
perl-Log--Log4perl \
perl-Regexp--Common \
perl-Sort--Key \
perl-Text--BibTeX \
perl-Text--CSV \
perl-Text--Roman \
perl-URI \
perl-Unicode--Collate \
perl-Unicode--GCString \
perl-XML--LibXML \
perl-XML--LibXML--Simple \
perl-XML--LibXSLT \
perl-XML--Writer \
perl-autovivification \
perl-base"

inherit rpm

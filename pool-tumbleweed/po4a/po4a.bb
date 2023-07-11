SUMMARY = "Framework to translate documentation and other materials"
DESCRIPTION = "Po4a extracts the translatable material from its input in a PO file. \
When the PO file is translated, it re-injects the translation in the structure of the document, \
and generates the translated document. \
If a string is not translated (i.e. it was not translated or it is 'fuzzy' \
because the original document was updated), the original string is used. \
This permits to provide always up-to-date documentation. \
 \
po4a supports currently the following formats: \
  * manpages \
  * POD \
  * XML (generic, DocBook, XHTML, Dia, Guide, or WML) \
  * SGML \
  * TeX (generic, LaTeX, BibTex or Texinfo) \
  * text (simple text files with some formatting, markdown, rubydoc or AsciiDoc) \
  * INI \
  * YAML \
  * KernelHelp"
LICENSE = "GPL-2.0-only"

PV = "0.69"

RPM_NAME = "po4a-0.69-1.3.noarch.rpm"
RPM_HASH = "e1b4c4ee4ac32c71af61ee64ff7dc8cb6f3fc89d66b88e6762033894538819e517a4c6deb20a64c2f7911a94008baf3401b66debab94667f580f30c0f6e734b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Po4a--AsciiDoc \
perl-Locale--Po4a--BibTeX \
perl-Locale--Po4a--Chooser \
perl-Locale--Po4a--Common \
perl-Locale--Po4a--Debconf \
perl-Locale--Po4a--Dia \
perl-Locale--Po4a--Docbook \
perl-Locale--Po4a--Guide \
perl-Locale--Po4a--Halibut \
perl-Locale--Po4a--Ini \
perl-Locale--Po4a--KernelHelp \
perl-Locale--Po4a--LaTeX \
perl-Locale--Po4a--Man \
perl-Locale--Po4a--NewsDebian \
perl-Locale--Po4a--Po \
perl-Locale--Po4a--Pod \
perl-Locale--Po4a--RubyDoc \
perl-Locale--Po4a--Sgml \
perl-Locale--Po4a--TeX \
perl-Locale--Po4a--Texinfo \
perl-Locale--Po4a--Text \
perl-Locale--Po4a--TransTractor \
perl-Locale--Po4a--Wml \
perl-Locale--Po4a--Xhtml \
perl-Locale--Po4a--Xml \
perl-Locale--Po4a--Yaml \
po4a"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
gettext-tools \
perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Parser \
perl-SGMLS \
perl-Syntax--Keyword--Try \
perl-YAML-Tiny"

inherit rpm

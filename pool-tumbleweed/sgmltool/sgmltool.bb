SUMMARY = "SGML-Tools - a Text-Formatting Package"
DESCRIPTION = "SGML-Tools is a text-formatting package based on SGML (Standard \
Generalized Markup Language), which allows you to produce LaTeX, HTML, \
GNU info, LyX, RTF, and plain ASCII documents (via groff) from a single \
source. \
 \
This system is tailored for writing technical software documentation, \
an example of which is the Linux HOWTO documents. It should be useful \
for all kinds of printed and online documentation. \
 \
This package is the successor to the Linuxdoc package. \
 \
SGML-Tools cannot process arbitrary SGML documents. In such a case, try \
jade_dsl and write your own DSSSL scripts (take the docbk30 package as \
an example)."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.9"

RPM_NAME = "sgmltool-1.0.9-1077.22.aarch64.rpm"
RPM_HASH = "1029132194ed6b6976d1d55c18745272e02b7e73bdcbea753c0dd580d0d9f038cb3aea976d4ce04b4d434595829cc4fd03cd961802c0bd099add647977e99b4e"

RPROVIDES:${PN} += "perl(SGMLTools) \
perl(SGMLTools::BackEnd) \
perl(SGMLTools::CharEnts) \
perl(SGMLTools::FixRef) \
perl(SGMLTools::Html2Html) \
perl(SGMLTools::Lang) \
perl(SGMLTools::Utils) \
perl(SGMLTools::Vars) \
perl(Text::EntityMap) \
perl(Text::EntityMapGroup) \
sgml-tools \
sgmltool \
sgmltool(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6()(64bit) \
libfl.so.2()(64bit) \
opensp \
perl"

inherit rpm

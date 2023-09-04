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

RPM_NAME = "sgmltool-1.0.9-1077.24.aarch64.rpm"
RPM_HASH = "5b69cb4f505d4495f22faeeb14d2198d7ce5567ff890235c4f136be6e7f3b5fa746a871b45d89bd68cf7dc643ff42ce5570e4211c7f2e6dc44b3debb2571d230"

RPROVIDES:${PN} += "perl-SGMLTools \
perl-SGMLTools--BackEnd \
perl-SGMLTools--CharEnts \
perl-SGMLTools--FixRef \
perl-SGMLTools--Html2Html \
perl-SGMLTools--Lang \
perl-SGMLTools--Utils \
perl-SGMLTools--Vars \
perl-Text--EntityMap \
perl-Text--EntityMapGroup \
sgml-tools \
sgmltool"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
libfl.so.2 \
opensp \
perl"

inherit rpm

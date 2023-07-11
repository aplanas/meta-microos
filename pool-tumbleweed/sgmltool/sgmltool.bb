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

RPM_NAME = "sgmltool-1.0.9-1077.23.aarch64.rpm"
RPM_HASH = "d94f8b05f04ada5d6663c4d1f52456b99f53884170e43e65755c05123dc889df8f5427f55c0e0d9a35bd07bf435bffc1350f55295cb53718129013674bf0696f"

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

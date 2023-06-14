SUMMARY = "Perl module for processing XSLT"
DESCRIPTION = "This module implements the W3C's XSLT specification. The goal is full \
implementation of this spec, but we have not yet achieved that. However, it \
already works well. See XML::XSLT Commands for the current status of each \
command. \
 \
XML::XSLT makes use of XML::DOM and LWP::Simple, while XML::DOM uses \
XML::Parser. Therefore XML::Parser, XML::DOM and LWP::Simple have to be \
installed properly for XML::XSLT to run."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.48"

RPM_NAME = "perl-XML-XSLT-0.48-198.13.noarch.rpm"
RPM_HASH = "b832ca8b082109be565ca021ec714fd1cd038f8be0b3910c228a7162519ed3c132bfa2f31cfb117e2c1ead5d54a3974f47a21e4d781919783961f16c8a311982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XSLT \
perl-XML--XSLT--DOM--TextDOE \
perl-XML-XSLT"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-XML--DOM \
perl-XML--Parser"

inherit rpm

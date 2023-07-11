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

RPM_NAME = "perl-XML-XSLT-0.48-198.14.noarch.rpm"
RPM_HASH = "6bcdf4f276a4e9ed3e0edf484de89b84ee7bc81ea322711711b0714e9eea741b85dd31f8531eec700a971ee20b9e8555608fbaa74a12f8c06d17e259ba7b77f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XSLT \
perl-XML--XSLT--DOM--TextDOE \
perl-XML-XSLT"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-XML--DOM \
perl-XML--Parser"

inherit rpm

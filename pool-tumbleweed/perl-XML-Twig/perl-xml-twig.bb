SUMMARY = "Perl Module for Processing Huge Xml Documents in Tree Mode"
DESCRIPTION = "This module provides a way to process XML documents. It is build on top of \
'XML::Parser'. \
 \
The module offers a tree interface to the document, while allowing you to \
output the parts of it that have been completely processed. \
 \
It allows minimal resource (CPU and memory) usage by building the tree only \
for the parts of the documents that need actual processing, through the use \
of the 'twig_roots ' and 'twig_print_outside_roots ' options. The 'finish ' \
and 'finish_print ' methods also help to increase performances. \
 \
XML::Twig tries to make simple things easy so it tries its best to takes \
care of a lot of the (usually) annoying (but sometimes necessary) features \
that come with XML and XML::Parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.52"

RPM_NAME = "perl-XML-Twig-3.52-2.14.noarch.rpm"
RPM_HASH = "eb1a60aaa9aa21cf81acc1eea596b014f9cdc00fd8f4d244a41f2d6f50743794c8af872a5faffcc68cefc165d32066ca912bc99ea5851424121d51b0cf26dfc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Twig \
perl-XML--Twig--Elt \
perl-XML--Twig--Entity \
perl-XML--Twig--Entity-list \
perl-XML--Twig--Notation \
perl-XML--Twig--Notation-list \
perl-XML--Twig--XPath \
perl-XML--Twig--XPath--Attribute \
perl-XML--Twig--XPath--Elt \
perl-XML--Twig--XPath--Namespace \
perl-XML-Twig"

RDEPENDS:${PN} += "/usr/bin/perl \
expat \
perl--MODULE-COMPAT-5.36.1 \
perl-Encode \
perl-XML--Parser \
perl-XML-Parser"

inherit rpm

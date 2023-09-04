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

RPM_NAME = "perl-XML-Twig-3.52-2.15.noarch.rpm"
RPM_HASH = "db1edaec2b78dff36b4a74270df9e9c292d752b96b0970cb3c133e7ba18e61a8e49469681d6c291ebc915c6bb95a256149a8e2cb58cd83cf177c4be758d5604f"
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
perl--MODULE-COMPAT-5.38.0 \
perl-Encode \
perl-XML--Parser \
perl-XML-Parser"

inherit rpm

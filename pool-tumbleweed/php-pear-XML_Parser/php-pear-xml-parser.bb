SUMMARY = "XML parsing class based on PHP's bundled expat"
DESCRIPTION = "This is an XML parser based on PHPs built-in xml extension. \
 \
It supports two basic modes of operation: 'func' and 'event'. In 'func' mode, \
it will look for a function named after each element (xmltag_ELEMENT for start \
tags and xmltag_ELEMENT_ for end tags), and in 'event' mode it uses a set of \
generic callbacks. \
 \
Since version 1.2.0 there's a new XML_Parser_Simple class that makes parsing of \
most XML documents easier, by automatically providing a stack for the elements. \
Furthermore its now possible to split the parser from the handler object, so \
you do not have to extend XML_Parser anymore in order to parse a document with \
it."
LICENSE = "BSD-2-Clause"

PV = "1.3.8"

RPM_NAME = "php-pear-XML_Parser-1.3.8-1.10.noarch.rpm"
RPM_HASH = "be2d158341f7fb7120f4cf5c8f1d992532431c09670548e6d8c122ec870a07e0b72d1711d748f4f44dd654675e50adb4d7b1c504fc484bf4eb32d83128514233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear(XML_Parser) \
php-pear-XML_Parser \
php5-pear-XML_Parser \
php7-pear-XML_Parser"

RDEPENDS:${PN} += "/bin/sh \
php-pear"

inherit rpm

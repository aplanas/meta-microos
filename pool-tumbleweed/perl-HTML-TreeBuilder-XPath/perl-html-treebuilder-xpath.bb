SUMMARY = "Add XPath support to HTML::TreeBuilder"
DESCRIPTION = "This module adds typical XPath methods to HTML::TreeBuilder, to make it \
easy to query a document."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-HTML-TreeBuilder-XPath-0.14-1.11.noarch.rpm"
RPM_HASH = "644aeb39d37c45355ab1008252d49d51d5a7941d83e36b06043bf6c35a328cfaa1bb246a51b02cfe8378f4f010b852d6ec20fe6b8662f0bca86715e8cb50399b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--TreeBuilder--XPath \
perl-HTML--TreeBuilder--XPath--Attribute \
perl-HTML--TreeBuilder--XPath--Node \
perl-HTML--TreeBuilder--XPath--Root \
perl-HTML--TreeBuilder--XPath--TextNode \
perl-HTML-TreeBuilder-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--TreeBuilder \
perl-XML--XPathEngine"

inherit rpm

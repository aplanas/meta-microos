SUMMARY = "Add XPath support to HTML::TreeBuilder"
DESCRIPTION = "This module adds typical XPath methods to HTML::TreeBuilder, to make it \
easy to query a document."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-HTML-TreeBuilder-XPath-0.14-1.9.noarch.rpm"
RPM_HASH = "9852c382ff6636a26c579c39ff3ced21fe1aeb129865eb4fd31e9a444a9d01f1825b7d016b1ccd7f299f0bbaff05b1a8462f57dc72e68746fc62feae377ecce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::TreeBuilder::XPath) \
perl(HTML::TreeBuilder::XPath::Attribute) \
perl(HTML::TreeBuilder::XPath::Node) \
perl(HTML::TreeBuilder::XPath::Root) \
perl(HTML::TreeBuilder::XPath::TextNode) \
perl-HTML-TreeBuilder-XPath"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTML::TreeBuilder) \
perl(XML::XPathEngine)"

inherit rpm

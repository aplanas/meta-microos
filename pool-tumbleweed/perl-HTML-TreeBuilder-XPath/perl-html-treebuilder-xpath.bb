SUMMARY = "Add XPath support to HTML::TreeBuilder"
DESCRIPTION = "This module adds typical XPath methods to HTML::TreeBuilder, to make it \
easy to query a document."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-HTML-TreeBuilder-XPath-0.14-1.10.noarch.rpm"
RPM_HASH = "5cc97378dc457bb7fffcc8960db9b5caf59868a10e6cdf4540def896d44ce342493c486551114769a81facc155057c00c684998acbfec840ece37fa3fc5d875c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--TreeBuilder--XPath \
perl-HTML--TreeBuilder--XPath--Attribute \
perl-HTML--TreeBuilder--XPath--Node \
perl-HTML--TreeBuilder--XPath--Root \
perl-HTML--TreeBuilder--XPath--TextNode \
perl-HTML-TreeBuilder-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--TreeBuilder \
perl-XML--XPathEngine"

inherit rpm

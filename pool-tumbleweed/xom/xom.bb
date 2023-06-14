SUMMARY = "XOM is a new XML object model"
DESCRIPTION = "XOM is designed to be easy to learn and easy to use. It works very \
straight-forwardly, and has a very shallow learning curve. Assuming \
you're already familiar with XML, you should be able to get up and \
running with XOM very quickly. \
 \
XOM is the only XML API that makes no compromises on correctness. XOM \
only accepts namespace well-formed XML documents, and only allows you \
to create namespace well-formed XML documents. (In fact, it's a little \
stricter than that: it actually guarantees that all documents are \
round-trippable and have well-defined XML infosets.) XOM manages your \
XML so you don't have to. With XOM, you can focus on the unique value \
of your application, and trust XOM to get the XML right. \
 \
XOM is fairly unique in that it is a dual streaming/tree-based API. \
Individual nodes in the tree can be processed while the document is \
still being built. The enables XOM programs to operate almost as fast \
as the underlying parser can supply data. You don't need to wait for \
the document to be completely parsed before you can start working with \
it. \
 \
XOM is very memory efficient. If you read an entire document into \
memory, XOM uses as little memory as possible. More importantly, XOM \
allows you to filter documents as they're built so you don't have to \
build the parts of the tree you aren't interested in. For instance, you \
can skip building text nodes that only represent boundary white space, \
if such white space is not significant in your application. You can \
even process a document piece by piece and throw away each piece when \
you're done with it. XOM has been used to process documents that are \
gigabytes in size. \
 \
XOM includes built-in support for a number of XML technologies \
including Namespaces in XML, XPath, XSLT, XInclude, xml:id, and \
Canonical XML. XOM documents can be converted to and from SAX and DOM."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2b1"

RPM_NAME = "xom-1.2b1-39.6.noarch.rpm"
RPM_HASH = "a96cbbfca04c1e67e3795eea74b7e2c884133ff02c3dffa2d60b1145ee7aca5df195ef0c03e188c9f7dbc8a28b2d7f0cfd55dfc2f820ca5e534fd120dc5ae2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.io7m.xom-xom \
mvn-com.io7m.xom-xom-pom- \
mvn-xom-xom \
mvn-xom-xom-pom- \
xom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-xalan-xalan \
mvn-xerces-xercesImpl \
mvn-xml-apis-xml-apis"

inherit rpm

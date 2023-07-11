SUMMARY = "XML Stream Buffer"
DESCRIPTION = "A stream buffer is a stream-based representation of an XML \
info-set in Java. Stream buffers are designed to: provide \
very efficient stream-based memory representations of XML \
info-sets; and be created and processed using any Java-based \
XML API. \
Conceptually a stream buffer is similar to the representation \
used in the Xerces deferred DOM implementation, with the crucial \
difference that a stream buffer does not store hierarchical \
information like parent and sibling information. The deferred \
DOM implementation reduces memory usage when large XML documents \
are parsed but only a subset of the document needs to be processed. \
(Note that using deferred DOM will be more expensive than \
non-deferred DOM in terms of memory and processing if all \
the document is traversed.) \
Stream buffers may be used as an efficient alternative to DOM where: \
* most or all of an XML info-set will eventually get traversed; and/or \
* targeted access to certain parts of an XML info-set are required \
 and need to be efficiently processed using stream-based APIs like \
 SAX or StAX."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.5.4"

RPM_NAME = "xmlstreambuffer-1.5.4-3.5.noarch.rpm"
RPM_HASH = "aca4bec4ceda0ef609e81485247679a531c87d20dbcfe10f3c0e3dcadf27fe70ee60bd41c9edceab6ae0394c9fb5f97dcea62b48aa51d63ed113dcbf9b2cf028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.sun.xml.stream.buffer-streambuffer \
mvn-com.sun.xml.stream.buffer-streambuffer-pom- \
osgi-com.sun.xml.stream.buffer.streambuffer \
xmlstreambuffer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jvnet.staxex-stax-ex"

inherit rpm

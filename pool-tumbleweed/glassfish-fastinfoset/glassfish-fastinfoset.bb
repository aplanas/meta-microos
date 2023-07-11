SUMMARY = "Fast Infoset"
DESCRIPTION = "Fast Infoset specifies a standardized binary encoding for the XML Information \
Set. An XML infoset (such as a DOM tree, StAX events or SAX events in \
programmatic representations) may be serialized to an XML 1.x document or, as \
specified by the Fast Infoset standard, may be serialized to a fast infoset \
document.  Fast infoset documents are generally smaller in size and faster to \
parse and serialize than equivalent XML documents."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-1.2.15-4.5.noarch.rpm"
RPM_HASH = "0ff3db45141dd1e7563225dca9c7ea5e3ae6763d4133e6ffa1b3c475e121c00cca8fa8924a517c92735049aefabbb8bb6887c69f55477e5b3ea7634d9ee51bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset \
mvn-com.sun.xml.fastinfoset-FastInfoset \
mvn-com.sun.xml.fastinfoset-FastInfoset-pom- \
mvn-com.sun.xml.fastinfoset-FastInfosetUtilities \
mvn-com.sun.xml.fastinfoset-FastInfosetUtilities-pom- \
mvn-com.sun.xml.fastinfoset-fastinfoset-project-pom- \
osgi-com.sun.xml.fastinfoset.FastInfoset"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.stream.buffer-streambuffer \
mvn-com.sun.xsom-xsom"

inherit rpm

SUMMARY = "SAXPath is an event-based API for XPath parsers"
DESCRIPTION = "SAXPath is an event-based API for XPath parsers, that is, for parsers \
which parse XPath  expressions. SAXPath is intended to be for XPath \
what SAX is for XML. Note that the SAXPath package only parses XPath \
expressions; it does not evaluate them, or even provide an object \
structure for representing them once they have been parsed."
LICENSE = "Apache-2.0"

PV = "1.0_FCS"

RPM_NAME = "saxpath-1.0_FCS-39.6.noarch.rpm"
RPM_HASH = "0b2ec080ad392aaee26941c4afe3085973edb828e35b09c9dc7a228584157a6b30c44409296d2421521baa5562b397e217a0f2e7b56640f2dd19e3e4674b0843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(saxpath:saxpath) \
mvn(saxpath:saxpath:pom:) \
saxpath"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

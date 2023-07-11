SUMMARY = "Java library for working with HTML"
DESCRIPTION = "jsoup is a Java library for working with HTML. \
It provides an API for extracting and manipulating data, \
using DOM, CSS, and jquery-like methods. \
 \
jsoup implements the WHATWG HTML5 specification. \
 \
 - scrapes and parses HTML from a URL, file, or string \
 - finds and extracts data, using DOM traversal or CSS selectors \
 - manipulates the HTML elements, attributes, and text \
 - cleans user-submitted content against a safe white-list, \
   to prevent XSS attacks \
 - outputs tidied HTML \
 \
jsoup can deal with invalid HTML tag soup."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "jsoup-1.15.3-2.3.noarch.rpm"
RPM_HASH = "2bb756d7959667754964bbe1529288d43e1f0f929e6c419620b143123d71758485b7fa245a9b81b3bc95e0a8a35297ab251bfda363976fd151fb0da64c354efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsoup \
mvn-org.jsoup-jsoup \
mvn-org.jsoup-jsoup-pom- \
osgi-org.jsoup"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

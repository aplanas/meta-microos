SUMMARY = "Feature rich package for accessing resources via HTTP"
DESCRIPTION = "Although the java.net  package provides basic functionality for \
accessing resources via HTTP, it doesn't provide the full flexibility \
or functionality needed by many applications. The Apache Commons \
HttpClient component provides a package implementing the client side \
of the most recent HTTP standards and recommendations. \
 \
The HttpClient component may be of interest to anyone building \
HTTP-aware client applications such as web browsers, web service \
clients, or systems that leverage or extend the HTTP protocol for \
distributed communication."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-3.1-13.11.noarch.rpm"
RPM_HASH = "606153a39f0129f8f544c3e3381625003c5216adffc748d71ca371c3b143890bf3a666dd2694639de5d3826ee86329a490627d32ef2876f7a6f8d771466ef14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient \
commons-httpclient \
jakarta-commons-httpclient \
jakarta-commons-httpclient3 \
mvn-apache-commons-httpclient \
mvn-apache-commons-httpclient-pom- \
mvn-commons-httpclient-commons-httpclient \
mvn-commons-httpclient-commons-httpclient-pom- \
osgi-org.apache.commons.httpclient"

RDEPENDS:${PN} += "commons-codec \
commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-logging-commons-logging"

inherit rpm

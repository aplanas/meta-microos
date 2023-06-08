SUMMARY = "Demonstration files for apache-commons-httpclient"
DESCRIPTION = "Demonstration files for apache-commons-httpclient. NOTE: It is \
possible that some demonstration files are specially prepared for SUN \
Java runtime environment. If they fail with IBM or BEA Java, the \
package itself does not need to be broken. \
 \
Demonstration files for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-demo-3.1-13.11.noarch.rpm"
RPM_HASH = "d389289cc61e5ef125ab4349f2c83c80e3a59a0e31743c1e0d974d288a6e5a7cfdd3834265ca7089124409e7821b72a2551063154cce9896cd878461d8e75190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-demo"
RDEPENDS:${PN} += "apache-commons-httpclient"

inherit rpm

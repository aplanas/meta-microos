SUMMARY = "Demonstration files for apache-commons-httpclient"
DESCRIPTION = "Demonstration files for apache-commons-httpclient. NOTE: It is \
possible that some demonstration files are specially prepared for SUN \
Java runtime environment. If they fail with IBM or BEA Java, the \
package itself does not need to be broken. \
 \
Demonstration files for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-demo-3.1-13.12.noarch.rpm"
RPM_HASH = "6757d68e0f67761328d05c6a03b3cbc5f6df9fd8573e06f54f861ca93b8dd09b60d6b170fb35b818a49e2a45a0b0af6a157911428a05dad961fbad9462a3ee21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-demo"

RDEPENDS:${PN} += "apache-commons-httpclient"

inherit rpm

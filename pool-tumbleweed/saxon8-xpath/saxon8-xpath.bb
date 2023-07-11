SUMMARY = "XPATH support for saxon8"
DESCRIPTION = "Provides support for the JAXP 1.3 XPath API. Requires the JAXP 1.3 \
version of jaxp-api.jar on the classpath, if not running under JDK 1.5."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-xpath-B.8.8-133.7.noarch.rpm"
RPM_HASH = "86d8bbfe3bccd63ca3a008602f250d9ca6567b3b35b1f69cf6c8104047d8a2e8fe9cb997d5a029728c8b5e6aef5017781fb7f284a0d40205abbf65e95b02c2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-xpath"

RDEPENDS:${PN} += "saxon8"

inherit rpm

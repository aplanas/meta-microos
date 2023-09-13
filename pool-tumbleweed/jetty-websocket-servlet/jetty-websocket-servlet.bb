SUMMARY = "The websocket-servlet module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-servlet-9.4.51-2.1.noarch.rpm"
RPM_HASH = "3ce012b3a23cd726fc8d2df26956d2ebcce6c95740866ffd9e0b9aee105fce66556c7e2597f03b7e791f8ff08aa655e117a40c17f32434e4153d28c7e44ff2e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-servlet \
mvn-org.eclipse.jetty.websocket-websocket-servlet \
mvn-org.eclipse.jetty.websocket-websocket-servlet-pom- \
osgi-org.eclipse.jetty.websocket.servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty.websocket-websocket-api"

inherit rpm

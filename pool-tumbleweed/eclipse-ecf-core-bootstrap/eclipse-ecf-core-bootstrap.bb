SUMMARY = "Eclipse ECF Core"
DESCRIPTION = " \
 \
 \
 \
ECF bundles required by eclipse-platform."
LICENSE = "Apache-2.0 & EPL-2.0 & BSD-3-Clause"

PV = "3.14.8"

RPM_NAME = "eclipse-ecf-core-bootstrap-3.14.8-4.6.aarch64.rpm"
RPM_HASH = "08a5a9d29e6724cf9b702f535c11db26ff6dcbe01e717923f4197fb53dd3849d38af35d2fb971bcb453f57a44d2764f21c4e73a59350a50a561e6c99c5badb51"

RPROVIDES:${PN} += "eclipse-ecf-core-bootstrap \
mvn-org.eclipse.ecf-org.eclipse.ecf \
mvn-org.eclipse.ecf-org.eclipse.ecf.core.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.core.ssl.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.httpclient4.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.httpclient4.ssl.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.httpclient45.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.ssl.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.identity \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.httpclient4 \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.httpclient4.ssl \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.httpclient45 \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.ssl \
mvn-org.eclipse.ecf-org.eclipse.ecf.ssl \
osgi-org.eclipse.ecf \
osgi-org.eclipse.ecf.core.feature \
osgi-org.eclipse.ecf.core.ssl.feature \
osgi-org.eclipse.ecf.filetransfer \
osgi-org.eclipse.ecf.filetransfer.feature \
osgi-org.eclipse.ecf.filetransfer.httpclient4.feature \
osgi-org.eclipse.ecf.filetransfer.httpclient4.ssl.feature \
osgi-org.eclipse.ecf.filetransfer.httpclient45.feature \
osgi-org.eclipse.ecf.filetransfer.ssl.feature \
osgi-org.eclipse.ecf.identity \
osgi-org.eclipse.ecf.provider.filetransfer \
osgi-org.eclipse.ecf.provider.filetransfer.httpclient4 \
osgi-org.eclipse.ecf.provider.filetransfer.httpclient4.ssl \
osgi-org.eclipse.ecf.provider.filetransfer.httpclient45 \
osgi-org.eclipse.ecf.provider.filetransfer.ssl \
osgi-org.eclipse.ecf.ssl"

RDEPENDS:${PN} += "httpcomponents-client \
httpcomponents-core \
java-headless \
javapackages-filesystem \
osgi-org.apache.httpcomponents.httpclient \
osgi-org.apache.httpcomponents.httpcore \
osgi-org.eclipse.core.jobs \
osgi-org.eclipse.core.net \
osgi-org.eclipse.osgi"

inherit rpm

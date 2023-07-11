SUMMARY = "Eclipse ECF Core"
DESCRIPTION = " \
ECF bundles required by eclipse-platform."
LICENSE = "Apache-2.0 & EPL-2.0 & BSD-3-Clause"

PV = "3.14.8"

RPM_NAME = "eclipse-ecf-core-3.14.8-4.6.aarch64.rpm"
RPM_HASH = "b4581aa80f186cb798e51fd715e45bad2df29a8679605c6962d40ddbc69568fe3cb2d5866a69a41b6b2efa0c3a7791f4077cb8dce9dcb1d051116cda2fa90941"

RPROVIDES:${PN} += "eclipse-ecf-core \
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
javapackages-filesystem"

inherit rpm

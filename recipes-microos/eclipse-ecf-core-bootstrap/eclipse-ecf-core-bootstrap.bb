SUMMARY = "Eclipse ECF Core"
DESCRIPTION = " \
 \
 \
 \
ECF bundles required by eclipse-platform."
LICENSE = "Apache-2.0 & EPL-2.0 & BSD-3-Clause"

PV = "3.14.8"

RPM_NAME = "eclipse-ecf-core-bootstrap-3.14.8-4.5.aarch64.rpm"
RPM_HASH = "903ffe30bc9757e251a57ea4154696146ef840d7dbc03ff7695f97d46d2e3548359625687c86f15b888fb920436a57ee44328a693013bbc7c381ab8e8fa0f1c2"

RPROVIDES:${PN} += "eclipse-ecf-core-bootstrap eclipse-ecf-core-bootstrap(aarch-64) mvn(org.eclipse.ecf:org.eclipse.ecf) mvn(org.eclipse.ecf:org.eclipse.ecf.core.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.core.ssl.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.filetransfer) mvn(org.eclipse.ecf:org.eclipse.ecf.filetransfer.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.filetransfer.httpclient4.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.filetransfer.httpclient4.ssl.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.filetransfer.httpclient45.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.filetransfer.ssl.feature) mvn(org.eclipse.ecf:org.eclipse.ecf.identity) mvn(org.eclipse.ecf:org.eclipse.ecf.provider.filetransfer) mvn(org.eclipse.ecf:org.eclipse.ecf.provider.filetransfer.httpclient4) mvn(org.eclipse.ecf:org.eclipse.ecf.provider.filetransfer.httpclient4.ssl) mvn(org.eclipse.ecf:org.eclipse.ecf.provider.filetransfer.httpclient45) mvn(org.eclipse.ecf:org.eclipse.ecf.provider.filetransfer.ssl) mvn(org.eclipse.ecf:org.eclipse.ecf.ssl) osgi(org.eclipse.ecf) osgi(org.eclipse.ecf.core.feature) osgi(org.eclipse.ecf.core.ssl.feature) osgi(org.eclipse.ecf.filetransfer) osgi(org.eclipse.ecf.filetransfer.feature) osgi(org.eclipse.ecf.filetransfer.httpclient4.feature) osgi(org.eclipse.ecf.filetransfer.httpclient4.ssl.feature) osgi(org.eclipse.ecf.filetransfer.httpclient45.feature) osgi(org.eclipse.ecf.filetransfer.ssl.feature) osgi(org.eclipse.ecf.identity) osgi(org.eclipse.ecf.provider.filetransfer) osgi(org.eclipse.ecf.provider.filetransfer.httpclient4) osgi(org.eclipse.ecf.provider.filetransfer.httpclient4.ssl) osgi(org.eclipse.ecf.provider.filetransfer.httpclient45) osgi(org.eclipse.ecf.provider.filetransfer.ssl) osgi(org.eclipse.ecf.ssl)"
RDEPENDS:${PN} += "httpcomponents-client httpcomponents-core java-headless javapackages-filesystem osgi(org.apache.httpcomponents.httpclient) osgi(org.apache.httpcomponents.httpcore) osgi(org.eclipse.core.jobs) osgi(org.eclipse.core.net) osgi(org.eclipse.osgi)"

inherit rpm

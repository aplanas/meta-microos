SUMMARY = "Eclipse SWTChart"
DESCRIPTION = "SWTChart is a light-weight charting component for SWT."
LICENSE = "EPL-2.0"

PV = "0.13.0"

RPM_NAME = "eclipse-swtchart-0.13.0-3.8.noarch.rpm"
RPM_HASH = "f25a9444690e2864ebb1ada2fa8502acf88408f95b94400118570fbd907838b38cb108eddd9f51ad2b4b547ab7b7d1132986dcf29d138708cc442157bb07a823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-swtchart \
mvn-org.eclipse.swtchart-org.eclipse.swtchart \
mvn-org.eclipse.swtchart-org.eclipse.swtchart.customcharts \
mvn-org.eclipse.swtchart-org.eclipse.swtchart.extensions \
osgi-org.eclipse.swtchart \
osgi-org.eclipse.swtchart.customcharts \
osgi-org.eclipse.swtchart.extensions"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "Eclipse SWTChart"
DESCRIPTION = "SWTChart is a light-weight charting component for SWT."
LICENSE = "EPL-2.0"

PV = "0.13.0"

RPM_NAME = "eclipse-swtchart-0.13.0-3.7.noarch.rpm"
RPM_HASH = "e37b4fc7b8c8560448f5866ad87b7a63212365baaf40b66cc6c01878bd12274ba12044c499cdc7ca778d8e9f2e41ff2d053b9649889603e8d2ff36ba317fc7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-swtchart \
mvn(org.eclipse.swtchart:org.eclipse.swtchart) \
mvn(org.eclipse.swtchart:org.eclipse.swtchart.customcharts) \
mvn(org.eclipse.swtchart:org.eclipse.swtchart.extensions) \
osgi(org.eclipse.swtchart) \
osgi(org.eclipse.swtchart.customcharts) \
osgi(org.eclipse.swtchart.extensions)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

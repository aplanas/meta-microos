SUMMARY = "Eclipse GEF Tests"
DESCRIPTION = "Tests for the Eclipse Graphical Editing Framework (GEF)."
LICENSE = "EPL-1.0"

PV = "3.11.0"

RPM_NAME = "eclipse-gef-tests-3.11.0-2.7.noarch.rpm"
RPM_HASH = "47b8c20f946fc227d9f7b3f21e93186551f51c351b6a08e4b9952c74d87820a29975d4a16ac2b38bdea965b330be47e26897a3faed07ebcae4f0dbaa13bcc778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-gef-tests mvn(org.eclipse.draw2d.plugins:org.eclipse.draw2d.tests) mvn(org.eclipse.draw2d.plugins:org.eclipse.draw2d.tests::sources:) mvn(org.eclipse.gef.plugins:org.eclipse.gef.tests) mvn(org.eclipse.gef.plugins:org.eclipse.gef.tests::sources:) mvn(org.eclipse.zest.plugins:org.eclipse.zest.tests) mvn(org.eclipse.zest.plugins:org.eclipse.zest.tests::sources:) osgi(org.eclipse.draw2d.tests) osgi(org.eclipse.draw2d.tests.source) osgi(org.eclipse.gef.tests) osgi(org.eclipse.gef.tests.source) osgi(org.eclipse.zest.tests) osgi(org.eclipse.zest.tests.source)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem osgi(org.eclipse.draw2d) osgi(org.eclipse.gef) osgi(org.eclipse.jdt) osgi(org.eclipse.jdt.core) osgi(org.eclipse.jdt.ui) osgi(org.eclipse.pde) osgi(org.eclipse.pde.ui) osgi(org.eclipse.zest.core) osgi(org.eclipse.zest.layouts) osgi(org.junit)"

inherit rpm

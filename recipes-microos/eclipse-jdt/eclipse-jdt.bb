SUMMARY = "Eclipse Java Development Tools"
DESCRIPTION = " \
Eclipse Java Development Tools.  This package is required to use Eclipse for \
developing software written in the Java programming language."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-jdt-4.15-9.3.noarch.rpm"
RPM_HASH = "a1ef94a11542e1e01abae0295c83eb3827f0ec8dbd8501092e8be197a389a8177f3d9ff9bfded7627b51f9f97ba8935bf80f5915f3bdd4d3d5e1421bd49255c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse \
eclipse-jdt \
metainfo() \
metainfo(eclipse-jdt.metainfo.xml) \
mvn(org.eclipse.ant:org.eclipse.ant.launching) \
mvn(org.eclipse.ant:org.eclipse.ant.ui) \
mvn(org.eclipse.jdt.feature:org.eclipse.jdt) \
mvn(org.eclipse.jdt:org.eclipse.jdt) \
mvn(org.eclipse.jdt:org.eclipse.jdt.annotation) \
mvn(org.eclipse.jdt:org.eclipse.jdt.apt.core) \
mvn(org.eclipse.jdt:org.eclipse.jdt.apt.pluggable.core) \
mvn(org.eclipse.jdt:org.eclipse.jdt.apt.ui) \
mvn(org.eclipse.jdt:org.eclipse.jdt.compiler.apt) \
mvn(org.eclipse.jdt:org.eclipse.jdt.compiler.tool) \
mvn(org.eclipse.jdt:org.eclipse.jdt.core) \
mvn(org.eclipse.jdt:org.eclipse.jdt.core.formatterapp) \
mvn(org.eclipse.jdt:org.eclipse.jdt.core.manipulation) \
mvn(org.eclipse.jdt:org.eclipse.jdt.debug) \
mvn(org.eclipse.jdt:org.eclipse.jdt.debug.ui) \
mvn(org.eclipse.jdt:org.eclipse.jdt.doc.user) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit.core) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit.runtime) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit4.runtime) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit5.runtime) \
mvn(org.eclipse.jdt:org.eclipse.jdt.launching) \
mvn(org.eclipse.jdt:org.eclipse.jdt.ui) \
osgi(org.eclipse.ant.launching) \
osgi(org.eclipse.ant.ui) \
osgi(org.eclipse.jdt) \
osgi(org.eclipse.jdt.annotation) \
osgi(org.eclipse.jdt.apt.core) \
osgi(org.eclipse.jdt.apt.pluggable.core) \
osgi(org.eclipse.jdt.apt.ui) \
osgi(org.eclipse.jdt.compiler.apt) \
osgi(org.eclipse.jdt.compiler.tool) \
osgi(org.eclipse.jdt.core) \
osgi(org.eclipse.jdt.core.formatterapp) \
osgi(org.eclipse.jdt.core.manipulation) \
osgi(org.eclipse.jdt.debug) \
osgi(org.eclipse.jdt.debug.ui) \
osgi(org.eclipse.jdt.doc.user) \
osgi(org.eclipse.jdt.junit) \
osgi(org.eclipse.jdt.junit.core) \
osgi(org.eclipse.jdt.junit.runtime) \
osgi(org.eclipse.jdt.junit4.runtime) \
osgi(org.eclipse.jdt.junit5.runtime) \
osgi(org.eclipse.jdt.launching) \
osgi(org.eclipse.jdt.ui)"
RDEPENDS:${PN} += "eclipse-platform \
java-headless \
javapackages-filesystem \
junit \
junit5 \
osgi(org.apiguardian) \
osgi(org.junit) \
osgi(org.junit.jupiter.api) \
osgi(org.junit.jupiter.engine) \
osgi(org.junit.jupiter.migrationsupport) \
osgi(org.junit.jupiter.params) \
osgi(org.junit.platform.commons) \
osgi(org.junit.platform.engine) \
osgi(org.junit.platform.launcher) \
osgi(org.junit.platform.runner) \
osgi(org.junit.platform.suite.api) \
osgi(org.junit.vintage.engine) \
osgi(org.opentest4j)"

inherit rpm

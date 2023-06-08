SUMMARY = "Tools for Eclipse Contributors"
DESCRIPTION = " \
This package contains tools specifically for Eclipse contributors. It includes \
SWT tools, E4 tools, Rel-Eng tools and Eclipse Test frameworks."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-contributor-tools-4.15-9.3.aarch64.rpm"
RPM_HASH = "1613fbf4826b44ee0f0fbe6fa25753762f22abe885e4679f31d5face33c429754f8006464b88330c31065c509428a0581d0b2d10b119e339e6e999f5f1f14590"

RPROVIDES:${PN} += "eclipse-contributor-tools eclipse-contributor-tools(aarch-64) mvn(eclipse.platform.ui.tool:org.eclipse.e4.tools) mvn(eclipse.platform.ui.tools:org.eclipse.e4.core.tools.feature) mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.compat) mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.emf.editor3x) mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.emf.ui) mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.jdt.templates) mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.services) mvn(org.eclipse.releng.feature:org.eclipse.releng.tools) mvn(org.eclipse.releng:org.eclipse.releng.tools) mvn(org.eclipse.swt.tools.feature:org.eclipse.swt.tools.feature) mvn(org.eclipse.swt:org.eclipse.swt.tools) mvn(org.eclipse.swt:org.eclipse.swt.tools.base) mvn(org.eclipse.swt:org.eclipse.swt.tools.spies) osgi(org.eclipse.e4.core.tools.feature) osgi(org.eclipse.e4.tools) osgi(org.eclipse.e4.tools.compat) osgi(org.eclipse.e4.tools.emf.editor3x) osgi(org.eclipse.e4.tools.emf.ui) osgi(org.eclipse.e4.tools.jdt.templates) osgi(org.eclipse.e4.tools.services) osgi(org.eclipse.releng.tools) osgi(org.eclipse.swt.tools) osgi(org.eclipse.swt.tools.base) osgi(org.eclipse.swt.tools.feature) osgi(org.eclipse.swt.tools.spies)"
RDEPENDS:${PN} += "eclipse-platform java-headless javapackages-filesystem osgi(org.eclipse.egit.core) osgi(org.eclipse.emf.databinding) osgi(org.eclipse.emf.databinding.edit) osgi(org.eclipse.emf.edit) osgi(org.eclipse.jdt.core) osgi(org.eclipse.jdt.launching) osgi(org.eclipse.jdt.ui) osgi(org.eclipse.jgit) osgi(org.eclipse.pde.core) osgi(org.eclipse.pde.ui)"

inherit rpm

SUMMARY = "Eclipse Modeling Framework (EMF) Eclipse plug-in"
DESCRIPTION = "The Eclipse Modeling Framework (EMF) allows developers to build tools and \
other applications based on a structured data model. From a model \
specification described in XMI, EMF provides tools and run-time support to \
produce a set of Java classes for the model, along with a set of adapter \
classes that enable viewing and command-based editing of the model, and a \
basic editor."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-runtime-2.22.0-3.6.noarch.rpm"
RPM_HASH = "daf6991b10e7cef99ab7bad761de559f8829faea91c7d72c24a02bc4d7624bda6f746854c24baa7d62d2f10964498131e17610f3641cba0dc239e9a2fcd59269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-emf-runtime \
mvn-org.eclipse.emf-org.eclipse.emf \
mvn-org.eclipse.emf-org.eclipse.emf.ant \
mvn-org.eclipse.emf-org.eclipse.emf.codegen \
mvn-org.eclipse.emf-org.eclipse.emf.codegen.ecore \
mvn-org.eclipse.emf-org.eclipse.emf.codegen.ecore.ui \
mvn-org.eclipse.emf-org.eclipse.emf.codegen.ui \
mvn-org.eclipse.emf-org.eclipse.emf.common.ui \
mvn-org.eclipse.emf-org.eclipse.emf.converter \
mvn-org.eclipse.emf-org.eclipse.emf.databinding \
mvn-org.eclipse.emf-org.eclipse.emf.databinding.edit \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.change.edit \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.edit \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.editor \
mvn-org.eclipse.emf-org.eclipse.emf.edit \
mvn-org.eclipse.emf-org.eclipse.emf.edit.ui \
mvn-org.eclipse.emf-org.eclipse.emf.exporter \
mvn-org.eclipse.emf-org.eclipse.emf.importer \
mvn-org.eclipse.emf-org.eclipse.emf.importer.ecore \
mvn-org.eclipse.emf-org.eclipse.emf.importer.java \
mvn-org.eclipse.emf-org.eclipse.emf.importer.rose \
mvn-org.eclipse.emf-org.eclipse.emf.mapping \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore.editor \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2ecore \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2ecore.editor \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2xml \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2xml.ui \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ui \
mvn-org.eclipse.emf.features-org.eclipse.emf \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen.ecore \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen.ecore.ui \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen.ui \
mvn-org.eclipse.emf.features-org.eclipse.emf.common.ui \
mvn-org.eclipse.emf.features-org.eclipse.emf.converter \
mvn-org.eclipse.emf.features-org.eclipse.emf.databinding \
mvn-org.eclipse.emf.features-org.eclipse.emf.databinding.edit \
mvn-org.eclipse.emf.features-org.eclipse.emf.ecore.edit \
mvn-org.eclipse.emf.features-org.eclipse.emf.ecore.editor \
mvn-org.eclipse.emf.features-org.eclipse.emf.edit \
mvn-org.eclipse.emf.features-org.eclipse.emf.edit.ui \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping.ecore \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping.ecore.editor \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping.ui \
osgi-org.eclipse.emf \
osgi-org.eclipse.emf.ant \
osgi-org.eclipse.emf.codegen \
osgi-org.eclipse.emf.codegen.ecore \
osgi-org.eclipse.emf.codegen.ecore.ui \
osgi-org.eclipse.emf.codegen.ui \
osgi-org.eclipse.emf.common.ui \
osgi-org.eclipse.emf.converter \
osgi-org.eclipse.emf.databinding \
osgi-org.eclipse.emf.databinding.edit \
osgi-org.eclipse.emf.ecore.change.edit \
osgi-org.eclipse.emf.ecore.edit \
osgi-org.eclipse.emf.ecore.editor \
osgi-org.eclipse.emf.edit \
osgi-org.eclipse.emf.edit.ui \
osgi-org.eclipse.emf.exporter \
osgi-org.eclipse.emf.importer \
osgi-org.eclipse.emf.importer.ecore \
osgi-org.eclipse.emf.importer.java \
osgi-org.eclipse.emf.importer.rose \
osgi-org.eclipse.emf.mapping \
osgi-org.eclipse.emf.mapping.ecore \
osgi-org.eclipse.emf.mapping.ecore.editor \
osgi-org.eclipse.emf.mapping.ecore2ecore \
osgi-org.eclipse.emf.mapping.ecore2ecore.editor \
osgi-org.eclipse.emf.mapping.ecore2xml \
osgi-org.eclipse.emf.mapping.ecore2xml.ui \
osgi-org.eclipse.emf.mapping.ui"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.eclipse.emf.common \
osgi-org.eclipse.emf.ecore \
osgi-org.eclipse.emf.ecore.change \
osgi-org.eclipse.emf.ecore.xmi \
osgi-org.eclipse.jdt.core \
osgi-org.eclipse.jdt.launching \
osgi-org.eclipse.jdt.ui"

inherit rpm

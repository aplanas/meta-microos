SUMMARY = "XML Schema Definition (XSD) Eclipse plug-in"
DESCRIPTION = "The XML Schema Definition (XSD) plug-in is a library that provides an API for \
manipulating the components of an XML Schema as described by the W3C XML \
Schema specifications, as well as an API for manipulating the DOM-accessible \
representation of XML Schema as a series of XML documents."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-xsd-2.22.0-3.5.noarch.rpm"
RPM_HASH = "a61a3424fed70f7500271e9b40fde6fd19735eb6fee99d079f3c6dc831112c70f92d6fa4e20207930640b6d636750ff446c829584598e5f9677276dab9a9afbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-emf-xsd \
mvn(org.eclipse.emf.features:org.eclipse.xsd) \
mvn(org.eclipse.emf.features:org.eclipse.xsd.ecore.converter) \
mvn(org.eclipse.emf.features:org.eclipse.xsd.edit) \
mvn(org.eclipse.emf.features:org.eclipse.xsd.editor) \
mvn(org.eclipse.emf.features:org.eclipse.xsd.mapping) \
mvn(org.eclipse.emf.features:org.eclipse.xsd.mapping.editor) \
mvn(org.eclipse.emf:org.eclipse.emf.mapping.xsd2ecore) \
mvn(org.eclipse.emf:org.eclipse.emf.mapping.xsd2ecore.editor) \
mvn(org.eclipse.emf:org.eclipse.xsd) \
mvn(org.eclipse.emf:org.eclipse.xsd.ecore.converter) \
mvn(org.eclipse.emf:org.eclipse.xsd.ecore.exporter) \
mvn(org.eclipse.emf:org.eclipse.xsd.ecore.importer) \
mvn(org.eclipse.emf:org.eclipse.xsd.edit) \
mvn(org.eclipse.emf:org.eclipse.xsd.editor) \
mvn(org.eclipse.emf:org.eclipse.xsd.mapping) \
mvn(org.eclipse.emf:org.eclipse.xsd.mapping.editor) \
osgi(org.eclipse.emf.mapping.xsd2ecore) \
osgi(org.eclipse.emf.mapping.xsd2ecore.editor) \
osgi(org.eclipse.xsd) \
osgi(org.eclipse.xsd.ecore.converter) \
osgi(org.eclipse.xsd.ecore.exporter) \
osgi(org.eclipse.xsd.ecore.importer) \
osgi(org.eclipse.xsd.edit) \
osgi(org.eclipse.xsd.editor) \
osgi(org.eclipse.xsd.mapping) \
osgi(org.eclipse.xsd.mapping.editor)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi(org.eclipse.emf.ant) \
osgi(org.eclipse.emf.codegen.ecore.ui) \
osgi(org.eclipse.emf.ecore) \
osgi(org.eclipse.emf.ecore.edit) \
osgi(org.eclipse.emf.ecore.xmi) \
osgi(org.eclipse.emf.edit) \
osgi(org.eclipse.emf.edit.ui) \
osgi(org.eclipse.emf.exporter) \
osgi(org.eclipse.emf.importer) \
osgi(org.eclipse.emf.mapping) \
osgi(org.eclipse.emf.mapping.ui)"

inherit rpm

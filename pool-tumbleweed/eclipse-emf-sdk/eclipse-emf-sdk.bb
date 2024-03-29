SUMMARY = "Eclipse EMF and XSD SDK"
DESCRIPTION = "Documentation and developer resources for the Eclipse Modeling Framework \
(EMF) plug-in and XML Schema Definition (XSD) plug-in."
LICENSE = "EPL-2.0"

PV = "2.22.0"

RPM_NAME = "eclipse-emf-sdk-2.22.0-3.6.noarch.rpm"
RPM_HASH = "f9217c25cba718fd5e1050733df99adced2a2da8eaddd424dbfdd873c3749b3ca6af2916455b5c92ba7aa67ba1101d21fa9ba3f488bc6bda2f4958d7b784e186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-emf-sdk \
mvn-org.eclipse.emf-org.eclipse.emf--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.ant--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.cheatsheets \
mvn-org.eclipse.emf-org.eclipse.emf.cheatsheets--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.codegen--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.codegen.ecore--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.codegen.ecore.ui--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.codegen.ui--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.common--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.common.ui--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.converter--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.databinding--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.databinding.edit--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.doc \
mvn-org.eclipse.emf-org.eclipse.emf.ecore--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.change--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.change.edit--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.edit--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.editor--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.ecore.xmi--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.edit--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.edit.ui--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.example.installer \
mvn-org.eclipse.emf-org.eclipse.emf.exporter--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.importer--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.importer.ecore--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.importer.java--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.importer.rose--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore.editor--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2ecore--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2ecore.editor--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2xml--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ecore2xml.ui--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.ui--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.xsd2ecore--sources- \
mvn-org.eclipse.emf-org.eclipse.emf.mapping.xsd2ecore.editor--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.cheatsheets \
mvn-org.eclipse.emf-org.eclipse.xsd.cheatsheets--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.doc \
mvn-org.eclipse.emf-org.eclipse.xsd.ecore.converter--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.ecore.exporter--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.ecore.importer--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.edit--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.editor--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.example.installer \
mvn-org.eclipse.emf-org.eclipse.xsd.mapping--sources- \
mvn-org.eclipse.emf-org.eclipse.xsd.mapping.editor--sources- \
mvn-org.eclipse.emf.features-org.eclipse.emf--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen.ecore--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen.ecore.ui--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.codegen.ui--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.common--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.common.ui--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.converter--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.databinding--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.databinding.edit--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.doc \
mvn-org.eclipse.emf.features-org.eclipse.emf.doc--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.ecore--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.ecore.edit--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.ecore.editor--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.edit--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.edit.ui--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping.ecore--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping.ecore.editor--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.mapping.ui--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.emf.sdk \
mvn-org.eclipse.emf.features-org.eclipse.xsd--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.doc \
mvn-org.eclipse.emf.features-org.eclipse.xsd.doc--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.ecore.converter--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.edit--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.editor--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.mapping--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.mapping.editor--sources-feature- \
mvn-org.eclipse.emf.features-org.eclipse.xsd.sdk \
osgi-org.eclipse.emf.ant.source \
osgi-org.eclipse.emf.cheatsheets \
osgi-org.eclipse.emf.cheatsheets.source \
osgi-org.eclipse.emf.codegen.ecore.source \
osgi-org.eclipse.emf.codegen.ecore.ui.source \
osgi-org.eclipse.emf.codegen.source \
osgi-org.eclipse.emf.codegen.ui.source \
osgi-org.eclipse.emf.common.source \
osgi-org.eclipse.emf.common.ui.source \
osgi-org.eclipse.emf.converter.source \
osgi-org.eclipse.emf.databinding.edit.source \
osgi-org.eclipse.emf.databinding.source \
osgi-org.eclipse.emf.doc \
osgi-org.eclipse.emf.doc.source \
osgi-org.eclipse.emf.ecore.change.edit.source \
osgi-org.eclipse.emf.ecore.change.source \
osgi-org.eclipse.emf.ecore.edit.source \
osgi-org.eclipse.emf.ecore.editor.source \
osgi-org.eclipse.emf.ecore.source \
osgi-org.eclipse.emf.ecore.xmi.source \
osgi-org.eclipse.emf.edit.source \
osgi-org.eclipse.emf.edit.ui.source \
osgi-org.eclipse.emf.example.installer \
osgi-org.eclipse.emf.exporter.source \
osgi-org.eclipse.emf.importer.ecore.source \
osgi-org.eclipse.emf.importer.java.source \
osgi-org.eclipse.emf.importer.rose.source \
osgi-org.eclipse.emf.importer.source \
osgi-org.eclipse.emf.mapping.ecore.editor.source \
osgi-org.eclipse.emf.mapping.ecore.source \
osgi-org.eclipse.emf.mapping.ecore2ecore.editor.source \
osgi-org.eclipse.emf.mapping.ecore2ecore.source \
osgi-org.eclipse.emf.mapping.ecore2xml.source \
osgi-org.eclipse.emf.mapping.ecore2xml.ui.source \
osgi-org.eclipse.emf.mapping.source \
osgi-org.eclipse.emf.mapping.ui.source \
osgi-org.eclipse.emf.mapping.xsd2ecore.editor.source \
osgi-org.eclipse.emf.mapping.xsd2ecore.source \
osgi-org.eclipse.emf.sdk \
osgi-org.eclipse.emf.source \
osgi-org.eclipse.xsd.cheatsheets \
osgi-org.eclipse.xsd.cheatsheets.source \
osgi-org.eclipse.xsd.doc \
osgi-org.eclipse.xsd.doc.source \
osgi-org.eclipse.xsd.ecore.converter.source \
osgi-org.eclipse.xsd.ecore.exporter.source \
osgi-org.eclipse.xsd.ecore.importer.source \
osgi-org.eclipse.xsd.edit.source \
osgi-org.eclipse.xsd.editor.source \
osgi-org.eclipse.xsd.example.installer \
osgi-org.eclipse.xsd.mapping.editor.source \
osgi-org.eclipse.xsd.mapping.source \
osgi-org.eclipse.xsd.sdk \
osgi-org.eclipse.xsd.source"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.eclipse.emf.codegen.ecore.ui \
osgi-org.eclipse.emf.common.ui \
osgi-org.eclipse.emf.ecore \
osgi-org.eclipse.emf.importer \
osgi-org.eclipse.emf.importer.java \
osgi-org.eclipse.emf.importer.rose \
osgi-org.eclipse.jdt.core \
osgi-org.eclipse.xsd \
osgi-org.eclipse.xsd.ecore.importer"

inherit rpm

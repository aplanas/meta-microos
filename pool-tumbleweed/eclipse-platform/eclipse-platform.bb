SUMMARY = "Eclipse platform common files"
DESCRIPTION = " \
The Eclipse Platform is the base of all IDE plugins.  This does not include the \
Java Development Tools or the Plugin Development Environment."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-platform-4.15-9.3.aarch64.rpm"
RPM_HASH = "3ea4bf1699e7fe6afcd0060b910448c2212448ca22861c423b24d340ee4da9544daca949437f8658ece637390213a762524671f9355583974e08c99c94de6e0d"

RPROVIDES:${PN} += "application() \
application(eclipse.desktop) \
config(eclipse-platform) \
eclipse-platform \
eclipse-platform(aarch-64) \
metainfo() \
metainfo(eclipse.appdata.xml) \
osgi(org.apache.ant) \
osgi(org.eclipse.ant.core) \
osgi(org.eclipse.compare) \
osgi(org.eclipse.compare.core) \
osgi(org.eclipse.core.commands) \
osgi(org.eclipse.core.contenttype) \
osgi(org.eclipse.core.databinding) \
osgi(org.eclipse.core.databinding.beans) \
osgi(org.eclipse.core.databinding.observable) \
osgi(org.eclipse.core.databinding.property) \
osgi(org.eclipse.core.expressions) \
osgi(org.eclipse.core.externaltools) \
osgi(org.eclipse.core.filebuffers) \
osgi(org.eclipse.core.filesystem) \
osgi(org.eclipse.core.jobs) \
osgi(org.eclipse.core.net) \
osgi(org.eclipse.core.resources) \
osgi(org.eclipse.core.runtime) \
osgi(org.eclipse.core.variables) \
osgi(org.eclipse.debug.core) \
osgi(org.eclipse.debug.ui) \
osgi(org.eclipse.e4.core.commands) \
osgi(org.eclipse.e4.core.contexts) \
osgi(org.eclipse.e4.core.di) \
osgi(org.eclipse.e4.core.di.annotations) \
osgi(org.eclipse.e4.core.di.extensions) \
osgi(org.eclipse.e4.core.di.extensions.supplier) \
osgi(org.eclipse.e4.core.services) \
osgi(org.eclipse.e4.emf.xpath) \
osgi(org.eclipse.e4.ui.bindings) \
osgi(org.eclipse.e4.ui.css.core) \
osgi(org.eclipse.e4.ui.css.swt) \
osgi(org.eclipse.e4.ui.css.swt.theme) \
osgi(org.eclipse.e4.ui.di) \
osgi(org.eclipse.e4.ui.dialogs) \
osgi(org.eclipse.e4.ui.ide) \
osgi(org.eclipse.e4.ui.model.workbench) \
osgi(org.eclipse.e4.ui.services) \
osgi(org.eclipse.e4.ui.swt.gtk) \
osgi(org.eclipse.e4.ui.widgets) \
osgi(org.eclipse.e4.ui.workbench) \
osgi(org.eclipse.e4.ui.workbench.addons.swt) \
osgi(org.eclipse.e4.ui.workbench.renderers.swt) \
osgi(org.eclipse.e4.ui.workbench.swt) \
osgi(org.eclipse.e4.ui.workbench3) \
osgi(org.eclipse.equinox.app) \
osgi(org.eclipse.equinox.bidi) \
osgi(org.eclipse.equinox.common) \
osgi(org.eclipse.equinox.concurrent) \
osgi(org.eclipse.equinox.console) \
osgi(org.eclipse.equinox.ds) \
osgi(org.eclipse.equinox.event) \
osgi(org.eclipse.equinox.frameworkadmin) \
osgi(org.eclipse.equinox.frameworkadmin.equinox) \
osgi(org.eclipse.equinox.http.jetty) \
osgi(org.eclipse.equinox.http.registry) \
osgi(org.eclipse.equinox.http.servlet) \
osgi(org.eclipse.equinox.jsp.jasper) \
osgi(org.eclipse.equinox.jsp.jasper.registry) \
osgi(org.eclipse.equinox.launcher) \
osgi(org.eclipse.equinox.launcher.gtk.linux.aarch64) \
osgi(org.eclipse.equinox.p2.artifact.repository) \
osgi(org.eclipse.equinox.p2.console) \
osgi(org.eclipse.equinox.p2.core) \
osgi(org.eclipse.equinox.p2.director) \
osgi(org.eclipse.equinox.p2.director.app) \
osgi(org.eclipse.equinox.p2.directorywatcher) \
osgi(org.eclipse.equinox.p2.engine) \
osgi(org.eclipse.equinox.p2.extensionlocation) \
osgi(org.eclipse.equinox.p2.garbagecollector) \
osgi(org.eclipse.equinox.p2.jarprocessor) \
osgi(org.eclipse.equinox.p2.metadata) \
osgi(org.eclipse.equinox.p2.metadata.repository) \
osgi(org.eclipse.equinox.p2.operations) \
osgi(org.eclipse.equinox.p2.publisher) \
osgi(org.eclipse.equinox.p2.publisher.eclipse) \
osgi(org.eclipse.equinox.p2.reconciler.dropins) \
osgi(org.eclipse.equinox.p2.repository) \
osgi(org.eclipse.equinox.p2.repository.tools) \
osgi(org.eclipse.equinox.p2.touchpoint.eclipse) \
osgi(org.eclipse.equinox.p2.touchpoint.natives) \
osgi(org.eclipse.equinox.p2.transport.ecf) \
osgi(org.eclipse.equinox.p2.ui) \
osgi(org.eclipse.equinox.p2.ui.importexport) \
osgi(org.eclipse.equinox.p2.ui.sdk) \
osgi(org.eclipse.equinox.p2.ui.sdk.scheduler) \
osgi(org.eclipse.equinox.p2.updatechecker) \
osgi(org.eclipse.equinox.p2.updatesite) \
osgi(org.eclipse.equinox.preferences) \
osgi(org.eclipse.equinox.registry) \
osgi(org.eclipse.equinox.security) \
osgi(org.eclipse.equinox.security.ui) \
osgi(org.eclipse.equinox.simpleconfigurator) \
osgi(org.eclipse.equinox.simpleconfigurator.manipulator) \
osgi(org.eclipse.help) \
osgi(org.eclipse.help.base) \
osgi(org.eclipse.help.ui) \
osgi(org.eclipse.help.webapp) \
osgi(org.eclipse.jdt.core.compiler.batch) \
osgi(org.eclipse.jetty.util.ajax) \
osgi(org.eclipse.jface) \
osgi(org.eclipse.jface.databinding) \
osgi(org.eclipse.jface.text) \
osgi(org.eclipse.jsch.core) \
osgi(org.eclipse.jsch.ui) \
osgi(org.eclipse.ltk.core.refactoring) \
osgi(org.eclipse.ltk.ui.refactoring) \
osgi(org.eclipse.platform) \
osgi(org.eclipse.platform.doc.user) \
osgi(org.eclipse.rcp) \
osgi(org.eclipse.search) \
osgi(org.eclipse.team.core) \
osgi(org.eclipse.team.genericeditor.diff.extension) \
osgi(org.eclipse.team.ui) \
osgi(org.eclipse.text) \
osgi(org.eclipse.text.quicksearch) \
osgi(org.eclipse.ui) \
osgi(org.eclipse.ui.browser) \
osgi(org.eclipse.ui.cheatsheets) \
osgi(org.eclipse.ui.console) \
osgi(org.eclipse.ui.editors) \
osgi(org.eclipse.ui.externaltools) \
osgi(org.eclipse.ui.forms) \
osgi(org.eclipse.ui.genericeditor) \
osgi(org.eclipse.ui.ide) \
osgi(org.eclipse.ui.ide.application) \
osgi(org.eclipse.ui.intro) \
osgi(org.eclipse.ui.intro.quicklinks) \
osgi(org.eclipse.ui.intro.universal) \
osgi(org.eclipse.ui.monitoring) \
osgi(org.eclipse.ui.navigator) \
osgi(org.eclipse.ui.navigator.resources) \
osgi(org.eclipse.ui.net) \
osgi(org.eclipse.ui.themes) \
osgi(org.eclipse.ui.views) \
osgi(org.eclipse.ui.views.log) \
osgi(org.eclipse.ui.views.properties.tabbed) \
osgi(org.eclipse.ui.workbench) \
osgi(org.eclipse.ui.workbench.texteditor) \
osgi(org.eclipse.update.configurator) \
osgi(org.eclipse.urischeme)"

RDEPENDS:${PN} += "ant \
ant-antlr \
ant-apache-bcel \
ant-apache-bsf \
ant-apache-log4j \
ant-apache-oro \
ant-apache-regexp \
ant-apache-resolver \
ant-apache-xalan2 \
ant-commons-logging \
ant-commons-net \
ant-javamail \
ant-jdepend \
ant-jmf \
ant-jsch \
ant-junit \
ant-junit5 \
ant-swing \
ant-testutil \
ant-xz \
apache-commons-codec \
apache-commons-jxpath \
apache-commons-logging \
atinject \
eclipse-ecf-core \
eclipse-emf-core \
eclipse-equinox-osgi \
eclipse-swt \
glassfish-annotation-api \
glassfish-el \
glassfish-el-api \
glassfish-jsp \
glassfish-jsp-api \
glassfish-servlet-api \
httpcomponents-client \
httpcomponents-core \
icu4j \
jsch \
libc.so.6(GLIBC_2.34)(64bit) \
lucene-analysis \
lucene-analyzers-smartcn \
lucene-core \
lucene-queryparser \
osgi(com.jcraft.jsch) \
osgi(javax.servlet-api) \
osgi(org.apache.batik.css) \
osgi(org.apache.commons.jxpath) \
osgi(org.apache.felix.gogo.command) \
osgi(org.apache.felix.gogo.runtime) \
osgi(org.apache.felix.gogo.shell) \
osgi(org.apache.felix.scr) \
osgi(org.apache.lucene.analyzers-common) \
osgi(org.apache.lucene.analyzers-smartcn) \
osgi(org.apache.lucene.core) \
osgi(org.eclipse.ecf) \
osgi(org.eclipse.ecf.filetransfer) \
osgi(org.eclipse.ecf.provider.filetransfer) \
osgi(org.eclipse.emf.ecore) \
osgi(org.eclipse.emf.ecore.change) \
osgi(org.eclipse.emf.ecore.xmi) \
osgi(org.eclipse.jetty.continuation) \
osgi(org.eclipse.jetty.http) \
osgi(org.eclipse.jetty.io) \
osgi(org.eclipse.jetty.security) \
osgi(org.eclipse.jetty.server) \
osgi(org.eclipse.jetty.servlet) \
osgi(org.eclipse.jetty.util) \
osgi(org.eclipse.osgi) \
osgi(org.eclipse.osgi.services) \
osgi(org.eclipse.swt) \
osgi(org.sat4j.core) \
osgi(org.sat4j.pb) \
osgi(org.tukaani.xz) \
osgi(org.w3c.css.sac) \
sac \
sat4j \
xml-commons-apis \
xmlgraphics-batik \
xmlgraphics-batik-css \
xmlgraphics-commons"

inherit rpm

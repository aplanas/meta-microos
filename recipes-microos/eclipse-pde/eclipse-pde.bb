SUMMARY = "Eclipse Plugin Development Environment"
DESCRIPTION = " \
Eclipse Plugin Development Environment.  This package is required for \
developing Eclipse plugins."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-pde-4.15-9.3.aarch64.rpm"
RPM_HASH = "e98cd5e068e4001722f318b7023d0d00d82df7213bdcc1a2000482924c0479111cabad2f5c5201f50c16df0229a78465bcb57add2a1f5c7cd77a0ecacecb7aa2"

RPROVIDES:${PN} += "eclipse-pde \
eclipse-pde(aarch-64) \
metainfo() \
metainfo(eclipse-pde.metainfo.xml) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.cdcfoundation10) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.cdcfoundation10::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.cdcfoundation11) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.cdcfoundation11::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.feature) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se12) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se12::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se13) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se13::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se14) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se14::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se15) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.j2se15::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase16) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase16::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase17) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase17::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase18) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase18::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase9) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.javase9::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.jre11) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.jre11::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.osgiminimum10) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.osgiminimum10::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.osgiminimum11) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.osgiminimum11::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.osgiminimum12) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ee.osgiminimum12::sources:) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ui) \
mvn(eclipse.pde.ui:org.eclipse.pde.api.tools.ui::sources:) \
mvn(eclipse.platform.resources:org.eclipse.core.filesystem::sources:) \
mvn(eclipse.platform.resources:org.eclipse.core.resources::sources:) \
mvn(eclipse.platform.text:org.eclipse.core.filebuffers::sources:) \
mvn(eclipse.platform.text:org.eclipse.jface.text::sources:) \
mvn(eclipse.platform.text:org.eclipse.search::sources:) \
mvn(eclipse.platform.text:org.eclipse.text.quicksearch::sources:) \
mvn(eclipse.platform.text:org.eclipse.text::sources:) \
mvn(eclipse.platform.text:org.eclipse.ui.editors::sources:) \
mvn(eclipse.platform.text:org.eclipse.ui.examples.javaeditor::sources:) \
mvn(eclipse.platform.text:org.eclipse.ui.genericeditor::sources:) \
mvn(eclipse.platform.text:org.eclipse.ui.workbench.texteditor::sources:) \
mvn(eclipse.platform.ui.tool:org.eclipse.e4.tools::sources:) \
mvn(eclipse.platform.ui.tools:org.eclipse.e4.core.tools.feature::sources-feature:) \
mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.compat::sources:) \
mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.emf.editor3x::sources:) \
mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.emf.ui::sources:) \
mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.jdt.templates::sources:) \
mvn(eclipse.platform.ui.tools:org.eclipse.e4.tools.services::sources:) \
mvn(eclipse.platform.ui:org.eclipse.core.databinding.beans::sources:) \
mvn(eclipse.platform.ui:org.eclipse.core.databinding.observable::sources:) \
mvn(eclipse.platform.ui:org.eclipse.core.databinding.property::sources:) \
mvn(eclipse.platform.ui:org.eclipse.core.databinding::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.core.commands::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.emf.xpath::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.bindings::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.css.core::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.css.swt.theme::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.css.swt::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.di::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.dialogs::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.model.workbench::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.services::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.widgets::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.workbench.addons.swt::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.workbench.renderers.swt::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.workbench.swt::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.workbench3::sources:) \
mvn(eclipse.platform.ui:org.eclipse.e4.ui.workbench::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui.browser::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui.forms::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui.ide.application::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui.monitoring::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui.navigator.resources::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui.themes::sources:) \
mvn(eclipse.platform.ui:org.eclipse.ui::sources:) \
mvn(eclipse.platform.ui:org.eclipse.urischeme::sources:) \
mvn(org.eclipse.ant:org.eclipse.ant.core::sources:) \
mvn(org.eclipse.ant:org.eclipse.ant.launching::sources:) \
mvn(org.eclipse.ant:org.eclipse.ant.ui::sources:) \
mvn(org.eclipse.compare:org.eclipse.compare.core::sources:) \
mvn(org.eclipse.compare:org.eclipse.compare::sources:) \
mvn(org.eclipse.core:org.eclipse.core.commands::sources:) \
mvn(org.eclipse.core:org.eclipse.core.contenttype::sources:) \
mvn(org.eclipse.core:org.eclipse.core.expressions::sources:) \
mvn(org.eclipse.core:org.eclipse.core.externaltools::sources:) \
mvn(org.eclipse.core:org.eclipse.core.jobs::sources:) \
mvn(org.eclipse.core:org.eclipse.core.net::sources:) \
mvn(org.eclipse.core:org.eclipse.core.runtime::sources:) \
mvn(org.eclipse.core:org.eclipse.core.variables::sources:) \
mvn(org.eclipse.cvs.feature:org.eclipse.cvs) \
mvn(org.eclipse.cvs.feature:org.eclipse.cvs::sources-feature:) \
mvn(org.eclipse.cvs:org.eclipse.cvs) \
mvn(org.eclipse.debug:org.eclipse.debug.core::sources:) \
mvn(org.eclipse.debug:org.eclipse.debug.ui::sources:) \
mvn(org.eclipse.e4.feature:org.eclipse.e4.rcp::sources-feature:) \
mvn(org.eclipse.e4:org.eclipse.e4.core.contexts::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.core.di.annotations::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.core.di.extensions.supplier::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.core.di.extensions::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.core.di::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.core.services::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.ui.progress::sources:) \
mvn(org.eclipse.e4:org.eclipse.e4.ui.swt.gtk::sources:) \
mvn(org.eclipse.equinox.feature:org.eclipse.equinox.executable) \
mvn(org.eclipse.equinox:org.eclipse.equinox.app::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.bidi::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.cm::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.common::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.concurrent::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.console::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.coordinator::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.device::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.ds::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.event::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.frameworkadmin.equinox::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.frameworkadmin::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.http.jetty::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.http.registry::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.http.servlet::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.jsp.jasper.registry::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.jsp.jasper::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.launcher::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.log.stream::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.metatype::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.artifact.repository::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.console::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.core.feature::sources-feature:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.core::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.director.app::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.director::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.directorywatcher::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.discovery.compatibility::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.discovery.feature::sources-feature:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.discovery::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.engine::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.extensionlocation::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.extras.feature::sources-feature:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.garbagecollector::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.installer::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.jarprocessor::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.metadata.repository::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.metadata::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.operations::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.publisher.eclipse::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.publisher::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.rcp.feature::sources-feature:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.reconciler.dropins::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.repository.tools::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.repository::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.sar::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.touchpoint.eclipse::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.touchpoint.natives::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.transport.ecf::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.admin.rcp::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.admin::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.discovery::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.importexport::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.sdk.scheduler::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.sdk::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.updatechecker::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.updatesite::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.p2.user.ui::sources-feature:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.preferences::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.region::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.registry::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.security.ui::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.security::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.simpleconfigurator.manipulator::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.simpleconfigurator::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.slf4j.stub::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.supplement::sources:) \
mvn(org.eclipse.equinox:org.eclipse.equinox.useradmin::sources:) \
mvn(org.eclipse.help.feature:org.eclipse.help::sources-feature:) \
mvn(org.eclipse.help:org.eclipse.help.base::sources:) \
mvn(org.eclipse.help:org.eclipse.help.ui::sources:) \
mvn(org.eclipse.help:org.eclipse.help.webapp::sources:) \
mvn(org.eclipse.help:org.eclipse.help::sources:) \
mvn(org.eclipse.jdt.feature:org.eclipse.jdt::sources-feature:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.annotation::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.apt.core::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.apt.pluggable.core::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.apt.ui::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.compiler.apt::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.compiler.tool::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.core.formatterapp::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.core.manipulation::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.core::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.debug.ui::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.debug::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.doc.isv) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit.core::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit.runtime::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit4.runtime::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit5.runtime::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.junit::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.launching::sources:) \
mvn(org.eclipse.jdt:org.eclipse.jdt.ui::sources:) \
mvn(org.eclipse.jface:org.eclipse.jface.databinding::sources:) \
mvn(org.eclipse.jface:org.eclipse.jface::sources:) \
mvn(org.eclipse.jsch:org.eclipse.jsch.core::sources:) \
mvn(org.eclipse.jsch:org.eclipse.jsch.ui::sources:) \
mvn(org.eclipse.ltk:org.eclipse.ltk.core.refactoring::sources:) \
mvn(org.eclipse.ltk:org.eclipse.ltk.ui.refactoring::sources:) \
mvn(org.eclipse.osgi:org.eclipse.osgi.compatibility.state::sources:) \
mvn(org.eclipse.osgi:org.eclipse.osgi.services::sources:) \
mvn(org.eclipse.osgi:org.eclipse.osgi.util::sources:) \
mvn(org.eclipse.osgi:org.eclipse.osgi::sources:) \
mvn(org.eclipse.pde.feature:org.eclipse.pde) \
mvn(org.eclipse.pde.feature:org.eclipse.pde::sources-feature:) \
mvn(org.eclipse.pde.ui:org.eclipse.pde.genericeditor.extension) \
mvn(org.eclipse.pde.ui:org.eclipse.pde.genericeditor.extension::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde) \
mvn(org.eclipse.pde:org.eclipse.pde.api.tools) \
mvn(org.eclipse.pde:org.eclipse.pde.api.tools.annotations) \
mvn(org.eclipse.pde:org.eclipse.pde.api.tools.annotations::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.api.tools::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.build) \
mvn(org.eclipse.pde:org.eclipse.pde.build::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.core) \
mvn(org.eclipse.pde:org.eclipse.pde.core::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.doc.user) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.annotations) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.annotations::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.core) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.core::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.lib) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.lib::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.ui) \
mvn(org.eclipse.pde:org.eclipse.pde.ds.ui::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ds1_2.lib) \
mvn(org.eclipse.pde:org.eclipse.pde.ds1_2.lib::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.junit.runtime) \
mvn(org.eclipse.pde:org.eclipse.pde.junit.runtime::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.launching) \
mvn(org.eclipse.pde:org.eclipse.pde.launching::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.runtime) \
mvn(org.eclipse.pde:org.eclipse.pde.runtime::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ua.core) \
mvn(org.eclipse.pde:org.eclipse.pde.ua.core::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ua.ui) \
mvn(org.eclipse.pde:org.eclipse.pde.ua.ui::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ui) \
mvn(org.eclipse.pde:org.eclipse.pde.ui.templates) \
mvn(org.eclipse.pde:org.eclipse.pde.ui.templates::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde.ui::sources:) \
mvn(org.eclipse.pde:org.eclipse.pde::sources:) \
mvn(org.eclipse.pde:org.eclipse.tools.layout.spy) \
mvn(org.eclipse.pde:org.eclipse.tools.layout.spy::sources:) \
mvn(org.eclipse.platform.feature:org.eclipse.platform::sources-feature:) \
mvn(org.eclipse.platform:org.eclipse.platform.doc.isv) \
mvn(org.eclipse.platform:org.eclipse.platform::sources:) \
mvn(org.eclipse.rcp.feature:org.eclipse.rcp::sources-feature:) \
mvn(org.eclipse.releng.feature:org.eclipse.releng.tools::sources-feature:) \
mvn(org.eclipse.releng:org.eclipse.releng.tools::sources:) \
mvn(org.eclipse.sdk.feature:org.eclipse.sdk) \
mvn(org.eclipse.sdk:org.eclipse.sdk) \
mvn(org.eclipse.swt.tools.feature:org.eclipse.swt.tools.feature::sources-feature:) \
mvn(org.eclipse.swt:org.eclipse.swt.examples.browser.demos::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.examples.launcher::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.examples.views::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.examples::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.gtk.linux.aarch64::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.tools.base::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.tools.spies::sources:) \
mvn(org.eclipse.swt:org.eclipse.swt.tools::sources:) \
mvn(org.eclipse.team:org.eclipse.team.core::sources:) \
mvn(org.eclipse.team:org.eclipse.team.cvs.core) \
mvn(org.eclipse.team:org.eclipse.team.cvs.core::sources:) \
mvn(org.eclipse.team:org.eclipse.team.cvs.ssh2) \
mvn(org.eclipse.team:org.eclipse.team.cvs.ssh2::sources:) \
mvn(org.eclipse.team:org.eclipse.team.cvs.ui) \
mvn(org.eclipse.team:org.eclipse.team.cvs.ui::sources:) \
mvn(org.eclipse.team:org.eclipse.team.genericeditor.diff.extension::sources:) \
mvn(org.eclipse.team:org.eclipse.team.ui::sources:) \
mvn(org.eclipse.ui:org.eclipse.e4.ui.ide::sources:) \
mvn(org.eclipse.ui:org.eclipse.platform.doc.tips::sources:) \
mvn(org.eclipse.ui:org.eclipse.tips.core::sources:) \
mvn(org.eclipse.ui:org.eclipse.tips.feature::sources-feature:) \
mvn(org.eclipse.ui:org.eclipse.tips.ide::sources:) \
mvn(org.eclipse.ui:org.eclipse.tips.json::sources:) \
mvn(org.eclipse.ui:org.eclipse.tips.ui::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.cheatsheets::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.console::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.externaltools::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.ide::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.intro.quicklinks::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.intro.universal::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.intro::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.navigator::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.net::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.trace) \
mvn(org.eclipse.ui:org.eclipse.ui.trace::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.views.log::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.views.properties.tabbed::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.views::sources:) \
mvn(org.eclipse.ui:org.eclipse.ui.workbench::sources:) \
mvn(org.eclipse.update:org.eclipse.update.configurator::sources:) \
osgi(org.eclipse.ant.core.source) \
osgi(org.eclipse.ant.launching.source) \
osgi(org.eclipse.ant.ui.source) \
osgi(org.eclipse.compare.core.source) \
osgi(org.eclipse.compare.source) \
osgi(org.eclipse.core.commands.source) \
osgi(org.eclipse.core.contenttype.source) \
osgi(org.eclipse.core.databinding.beans.source) \
osgi(org.eclipse.core.databinding.observable.source) \
osgi(org.eclipse.core.databinding.property.source) \
osgi(org.eclipse.core.databinding.source) \
osgi(org.eclipse.core.expressions.source) \
osgi(org.eclipse.core.externaltools.source) \
osgi(org.eclipse.core.filebuffers.source) \
osgi(org.eclipse.core.filesystem.source) \
osgi(org.eclipse.core.jobs.source) \
osgi(org.eclipse.core.net.source) \
osgi(org.eclipse.core.resources.source) \
osgi(org.eclipse.core.runtime.source) \
osgi(org.eclipse.core.variables.source) \
osgi(org.eclipse.cvs) \
osgi(org.eclipse.cvs.source) \
osgi(org.eclipse.debug.core.source) \
osgi(org.eclipse.debug.ui.source) \
osgi(org.eclipse.e4.core.commands.source) \
osgi(org.eclipse.e4.core.contexts.source) \
osgi(org.eclipse.e4.core.di.annotations.source) \
osgi(org.eclipse.e4.core.di.extensions.source) \
osgi(org.eclipse.e4.core.di.extensions.supplier.source) \
osgi(org.eclipse.e4.core.di.source) \
osgi(org.eclipse.e4.core.services.source) \
osgi(org.eclipse.e4.core.tools.feature.source) \
osgi(org.eclipse.e4.emf.xpath.source) \
osgi(org.eclipse.e4.rcp.source) \
osgi(org.eclipse.e4.tools.compat.source) \
osgi(org.eclipse.e4.tools.emf.editor3x.source) \
osgi(org.eclipse.e4.tools.emf.ui.source) \
osgi(org.eclipse.e4.tools.jdt.templates.source) \
osgi(org.eclipse.e4.tools.services.source) \
osgi(org.eclipse.e4.tools.source) \
osgi(org.eclipse.e4.ui.bindings.source) \
osgi(org.eclipse.e4.ui.css.core.source) \
osgi(org.eclipse.e4.ui.css.swt.source) \
osgi(org.eclipse.e4.ui.css.swt.theme.source) \
osgi(org.eclipse.e4.ui.di.source) \
osgi(org.eclipse.e4.ui.dialogs.source) \
osgi(org.eclipse.e4.ui.ide.source) \
osgi(org.eclipse.e4.ui.model.workbench.source) \
osgi(org.eclipse.e4.ui.progress.source) \
osgi(org.eclipse.e4.ui.services.source) \
osgi(org.eclipse.e4.ui.swt.gtk.source) \
osgi(org.eclipse.e4.ui.widgets.source) \
osgi(org.eclipse.e4.ui.workbench.addons.swt.source) \
osgi(org.eclipse.e4.ui.workbench.renderers.swt.source) \
osgi(org.eclipse.e4.ui.workbench.source) \
osgi(org.eclipse.e4.ui.workbench.swt.source) \
osgi(org.eclipse.e4.ui.workbench3.source) \
osgi(org.eclipse.equinox.app.source) \
osgi(org.eclipse.equinox.bidi.source) \
osgi(org.eclipse.equinox.cm.source) \
osgi(org.eclipse.equinox.common.source) \
osgi(org.eclipse.equinox.concurrent.source) \
osgi(org.eclipse.equinox.console.source) \
osgi(org.eclipse.equinox.coordinator.source) \
osgi(org.eclipse.equinox.device.source) \
osgi(org.eclipse.equinox.ds.source) \
osgi(org.eclipse.equinox.event.source) \
osgi(org.eclipse.equinox.executable) \
osgi(org.eclipse.equinox.frameworkadmin.equinox.source) \
osgi(org.eclipse.equinox.frameworkadmin.source) \
osgi(org.eclipse.equinox.http.jetty.source) \
osgi(org.eclipse.equinox.http.registry.source) \
osgi(org.eclipse.equinox.http.servlet.source) \
osgi(org.eclipse.equinox.jsp.jasper.registry.source) \
osgi(org.eclipse.equinox.jsp.jasper.source) \
osgi(org.eclipse.equinox.launcher.source) \
osgi(org.eclipse.equinox.log.stream.source) \
osgi(org.eclipse.equinox.metatype.source) \
osgi(org.eclipse.equinox.p2.artifact.repository.source) \
osgi(org.eclipse.equinox.p2.console.source) \
osgi(org.eclipse.equinox.p2.core.feature.source) \
osgi(org.eclipse.equinox.p2.core.source) \
osgi(org.eclipse.equinox.p2.director.app.source) \
osgi(org.eclipse.equinox.p2.director.source) \
osgi(org.eclipse.equinox.p2.directorywatcher.source) \
osgi(org.eclipse.equinox.p2.discovery.compatibility.source) \
osgi(org.eclipse.equinox.p2.discovery.feature.source) \
osgi(org.eclipse.equinox.p2.discovery.source) \
osgi(org.eclipse.equinox.p2.engine.source) \
osgi(org.eclipse.equinox.p2.extensionlocation.source) \
osgi(org.eclipse.equinox.p2.extras.feature.source) \
osgi(org.eclipse.equinox.p2.garbagecollector.source) \
osgi(org.eclipse.equinox.p2.installer.source) \
osgi(org.eclipse.equinox.p2.jarprocessor.source) \
osgi(org.eclipse.equinox.p2.metadata.repository.source) \
osgi(org.eclipse.equinox.p2.metadata.source) \
osgi(org.eclipse.equinox.p2.operations.source) \
osgi(org.eclipse.equinox.p2.publisher.eclipse.source) \
osgi(org.eclipse.equinox.p2.publisher.source) \
osgi(org.eclipse.equinox.p2.rcp.feature.source) \
osgi(org.eclipse.equinox.p2.reconciler.dropins.source) \
osgi(org.eclipse.equinox.p2.repository.source) \
osgi(org.eclipse.equinox.p2.repository.tools.source) \
osgi(org.eclipse.equinox.p2.sar.source) \
osgi(org.eclipse.equinox.p2.touchpoint.eclipse.source) \
osgi(org.eclipse.equinox.p2.touchpoint.natives.source) \
osgi(org.eclipse.equinox.p2.transport.ecf.source) \
osgi(org.eclipse.equinox.p2.ui.admin.rcp.source) \
osgi(org.eclipse.equinox.p2.ui.admin.source) \
osgi(org.eclipse.equinox.p2.ui.discovery.source) \
osgi(org.eclipse.equinox.p2.ui.importexport.source) \
osgi(org.eclipse.equinox.p2.ui.sdk.scheduler.source) \
osgi(org.eclipse.equinox.p2.ui.sdk.source) \
osgi(org.eclipse.equinox.p2.ui.source) \
osgi(org.eclipse.equinox.p2.updatechecker.source) \
osgi(org.eclipse.equinox.p2.updatesite.source) \
osgi(org.eclipse.equinox.p2.user.ui.source) \
osgi(org.eclipse.equinox.preferences.source) \
osgi(org.eclipse.equinox.region.source) \
osgi(org.eclipse.equinox.registry.source) \
osgi(org.eclipse.equinox.security.source) \
osgi(org.eclipse.equinox.security.ui.source) \
osgi(org.eclipse.equinox.simpleconfigurator.manipulator.source) \
osgi(org.eclipse.equinox.simpleconfigurator.source) \
osgi(org.eclipse.equinox.slf4j.stub.source) \
osgi(org.eclipse.equinox.supplement.source) \
osgi(org.eclipse.equinox.useradmin.source) \
osgi(org.eclipse.help.base.source) \
osgi(org.eclipse.help.source) \
osgi(org.eclipse.help.ui.source) \
osgi(org.eclipse.help.webapp.source) \
osgi(org.eclipse.jdt.annotation.source) \
osgi(org.eclipse.jdt.apt.core.source) \
osgi(org.eclipse.jdt.apt.pluggable.core.source) \
osgi(org.eclipse.jdt.apt.ui.source) \
osgi(org.eclipse.jdt.compiler.apt.source) \
osgi(org.eclipse.jdt.compiler.tool.source) \
osgi(org.eclipse.jdt.core.formatterapp.source) \
osgi(org.eclipse.jdt.core.manipulation.source) \
osgi(org.eclipse.jdt.core.source) \
osgi(org.eclipse.jdt.debug.source) \
osgi(org.eclipse.jdt.debug.ui.source) \
osgi(org.eclipse.jdt.doc.isv) \
osgi(org.eclipse.jdt.junit.core.source) \
osgi(org.eclipse.jdt.junit.runtime.source) \
osgi(org.eclipse.jdt.junit.source) \
osgi(org.eclipse.jdt.junit4.runtime.source) \
osgi(org.eclipse.jdt.junit5.runtime.source) \
osgi(org.eclipse.jdt.launching.source) \
osgi(org.eclipse.jdt.source) \
osgi(org.eclipse.jdt.ui.source) \
osgi(org.eclipse.jface.databinding.source) \
osgi(org.eclipse.jface.source) \
osgi(org.eclipse.jface.text.source) \
osgi(org.eclipse.jsch.core.source) \
osgi(org.eclipse.jsch.ui.source) \
osgi(org.eclipse.ltk.core.refactoring.source) \
osgi(org.eclipse.ltk.ui.refactoring.source) \
osgi(org.eclipse.osgi.compatibility.state.source) \
osgi(org.eclipse.osgi.services.source) \
osgi(org.eclipse.osgi.source) \
osgi(org.eclipse.osgi.util.source) \
osgi(org.eclipse.pde) \
osgi(org.eclipse.pde.api.tools) \
osgi(org.eclipse.pde.api.tools.annotations) \
osgi(org.eclipse.pde.api.tools.annotations.source) \
osgi(org.eclipse.pde.api.tools.ee.cdcfoundation10) \
osgi(org.eclipse.pde.api.tools.ee.cdcfoundation10.source) \
osgi(org.eclipse.pde.api.tools.ee.cdcfoundation11) \
osgi(org.eclipse.pde.api.tools.ee.cdcfoundation11.source) \
osgi(org.eclipse.pde.api.tools.ee.feature) \
osgi(org.eclipse.pde.api.tools.ee.j2se12) \
osgi(org.eclipse.pde.api.tools.ee.j2se12.source) \
osgi(org.eclipse.pde.api.tools.ee.j2se13) \
osgi(org.eclipse.pde.api.tools.ee.j2se13.source) \
osgi(org.eclipse.pde.api.tools.ee.j2se14) \
osgi(org.eclipse.pde.api.tools.ee.j2se14.source) \
osgi(org.eclipse.pde.api.tools.ee.j2se15) \
osgi(org.eclipse.pde.api.tools.ee.j2se15.source) \
osgi(org.eclipse.pde.api.tools.ee.javase16) \
osgi(org.eclipse.pde.api.tools.ee.javase16.source) \
osgi(org.eclipse.pde.api.tools.ee.javase17) \
osgi(org.eclipse.pde.api.tools.ee.javase17.source) \
osgi(org.eclipse.pde.api.tools.ee.javase18) \
osgi(org.eclipse.pde.api.tools.ee.javase18.source) \
osgi(org.eclipse.pde.api.tools.ee.javase9) \
osgi(org.eclipse.pde.api.tools.ee.javase9.source) \
osgi(org.eclipse.pde.api.tools.ee.jre11) \
osgi(org.eclipse.pde.api.tools.ee.jre11.source) \
osgi(org.eclipse.pde.api.tools.ee.osgiminimum10) \
osgi(org.eclipse.pde.api.tools.ee.osgiminimum10.source) \
osgi(org.eclipse.pde.api.tools.ee.osgiminimum11) \
osgi(org.eclipse.pde.api.tools.ee.osgiminimum11.source) \
osgi(org.eclipse.pde.api.tools.ee.osgiminimum12) \
osgi(org.eclipse.pde.api.tools.ee.osgiminimum12.source) \
osgi(org.eclipse.pde.api.tools.source) \
osgi(org.eclipse.pde.api.tools.ui) \
osgi(org.eclipse.pde.api.tools.ui.source) \
osgi(org.eclipse.pde.build) \
osgi(org.eclipse.pde.build.source) \
osgi(org.eclipse.pde.core) \
osgi(org.eclipse.pde.core.source) \
osgi(org.eclipse.pde.doc.user) \
osgi(org.eclipse.pde.ds.annotations) \
osgi(org.eclipse.pde.ds.annotations.source) \
osgi(org.eclipse.pde.ds.core) \
osgi(org.eclipse.pde.ds.core.source) \
osgi(org.eclipse.pde.ds.lib) \
osgi(org.eclipse.pde.ds.lib.source) \
osgi(org.eclipse.pde.ds.ui) \
osgi(org.eclipse.pde.ds.ui.source) \
osgi(org.eclipse.pde.ds1_2.lib) \
osgi(org.eclipse.pde.ds1_2.lib.source) \
osgi(org.eclipse.pde.genericeditor.extension) \
osgi(org.eclipse.pde.genericeditor.extension.source) \
osgi(org.eclipse.pde.junit.runtime) \
osgi(org.eclipse.pde.junit.runtime.source) \
osgi(org.eclipse.pde.launching) \
osgi(org.eclipse.pde.launching.source) \
osgi(org.eclipse.pde.runtime) \
osgi(org.eclipse.pde.runtime.source) \
osgi(org.eclipse.pde.source) \
osgi(org.eclipse.pde.ua.core) \
osgi(org.eclipse.pde.ua.core.source) \
osgi(org.eclipse.pde.ua.ui) \
osgi(org.eclipse.pde.ua.ui.source) \
osgi(org.eclipse.pde.ui) \
osgi(org.eclipse.pde.ui.source) \
osgi(org.eclipse.pde.ui.templates) \
osgi(org.eclipse.pde.ui.templates.source) \
osgi(org.eclipse.platform.doc.isv) \
osgi(org.eclipse.platform.doc.tips.source) \
osgi(org.eclipse.platform.source) \
osgi(org.eclipse.rcp.source) \
osgi(org.eclipse.releng.tools.source) \
osgi(org.eclipse.sdk) \
osgi(org.eclipse.search.source) \
osgi(org.eclipse.swt.examples.browser.demos.source) \
osgi(org.eclipse.swt.examples.launcher.source) \
osgi(org.eclipse.swt.examples.source) \
osgi(org.eclipse.swt.examples.views.source) \
osgi(org.eclipse.swt.gtk.linux.aarch64.source) \
osgi(org.eclipse.swt.tools.base.source) \
osgi(org.eclipse.swt.tools.feature.source) \
osgi(org.eclipse.swt.tools.source) \
osgi(org.eclipse.swt.tools.spies.source) \
osgi(org.eclipse.team.core.source) \
osgi(org.eclipse.team.cvs.core) \
osgi(org.eclipse.team.cvs.core.source) \
osgi(org.eclipse.team.cvs.ssh2) \
osgi(org.eclipse.team.cvs.ssh2.source) \
osgi(org.eclipse.team.cvs.ui) \
osgi(org.eclipse.team.cvs.ui.source) \
osgi(org.eclipse.team.genericeditor.diff.extension.source) \
osgi(org.eclipse.team.ui.source) \
osgi(org.eclipse.text.quicksearch.source) \
osgi(org.eclipse.text.source) \
osgi(org.eclipse.tips.core.source) \
osgi(org.eclipse.tips.feature.source) \
osgi(org.eclipse.tips.ide.source) \
osgi(org.eclipse.tips.json.source) \
osgi(org.eclipse.tips.ui.source) \
osgi(org.eclipse.tools.layout.spy) \
osgi(org.eclipse.tools.layout.spy.source) \
osgi(org.eclipse.ui.browser.source) \
osgi(org.eclipse.ui.cheatsheets.source) \
osgi(org.eclipse.ui.console.source) \
osgi(org.eclipse.ui.editors.source) \
osgi(org.eclipse.ui.examples.javaeditor.source) \
osgi(org.eclipse.ui.externaltools.source) \
osgi(org.eclipse.ui.forms.source) \
osgi(org.eclipse.ui.genericeditor.source) \
osgi(org.eclipse.ui.ide.application.source) \
osgi(org.eclipse.ui.ide.source) \
osgi(org.eclipse.ui.intro.quicklinks.source) \
osgi(org.eclipse.ui.intro.source) \
osgi(org.eclipse.ui.intro.universal.source) \
osgi(org.eclipse.ui.monitoring.source) \
osgi(org.eclipse.ui.navigator.resources.source) \
osgi(org.eclipse.ui.navigator.source) \
osgi(org.eclipse.ui.net.source) \
osgi(org.eclipse.ui.source) \
osgi(org.eclipse.ui.themes.source) \
osgi(org.eclipse.ui.trace) \
osgi(org.eclipse.ui.trace.source) \
osgi(org.eclipse.ui.views.log.source) \
osgi(org.eclipse.ui.views.properties.tabbed.source) \
osgi(org.eclipse.ui.views.source) \
osgi(org.eclipse.ui.workbench.source) \
osgi(org.eclipse.ui.workbench.texteditor.source) \
osgi(org.eclipse.update.configurator.source) \
osgi(org.eclipse.urischeme.source)"
RDEPENDS:${PN} += "eclipse-jdt \
eclipse-platform \
java-headless \
javapackages-filesystem \
objectweb-asm \
osgi(org.eclipse.ant.launching) \
osgi(org.eclipse.ant.ui) \
osgi(org.eclipse.jdt.annotation) \
osgi(org.eclipse.jdt.core) \
osgi(org.eclipse.jdt.core.manipulation) \
osgi(org.eclipse.jdt.debug) \
osgi(org.eclipse.jdt.debug.ui) \
osgi(org.eclipse.jdt.junit) \
osgi(org.eclipse.jdt.junit.core) \
osgi(org.eclipse.jdt.junit.runtime) \
osgi(org.eclipse.jdt.launching) \
osgi(org.eclipse.jdt.ui) \
osgi(org.junit) \
osgi(org.objectweb.asm) \
osgi(org.objectweb.asm.tree)"

inherit rpm

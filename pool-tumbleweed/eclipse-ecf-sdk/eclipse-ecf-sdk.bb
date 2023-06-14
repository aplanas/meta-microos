SUMMARY = "Eclipse ECF SDK"
DESCRIPTION = "Documentation and developer resources for the Eclipse Communication Framework \
(ECF) plug-in."
LICENSE = "Apache-2.0 & EPL-2.0 & BSD-3-Clause"

PV = "3.14.8"

RPM_NAME = "eclipse-ecf-sdk-3.14.8-4.5.noarch.rpm"
RPM_HASH = "9f8c583eb503b6bc4b1bba74d215ad51abc451f36fe5d863522acb0b89509f575d03f8efc89ec2ec8cc2874b08cecb92892b108b66eb2a0dfbccb3dfaa2c3e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-ecf-sdk \
mvn-org.eclipse.ecf-ch.ethz.iks.r-osgi.remote--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.console--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.console.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.core \
mvn-org.eclipse.ecf-org.eclipse.ecf.core--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.core.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.core.ssl.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.datashare--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.datashare.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.jmdns.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.browser \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.browser--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.edit \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.edit--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.model \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.model--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.properties \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.properties--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.properties.tabbed \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.properties.tabbed--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.userinput \
mvn-org.eclipse.ecf-org.eclipse.ecf.discovery.ui.userinput--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.doc \
mvn-org.eclipse.ecf-org.eclipse.ecf.doc--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.docshare \
mvn-org.eclipse.ecf-org.eclipse.ecf.docshare--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.docshare.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.docshare.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.eventadmin.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.httpclient4.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.httpclient4.ssl.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.httpclient45.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.ssl.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.filetransfer.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.identity--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.osgi.services.distribution--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.osgi.services.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.osgi.services.remoteserviceadmin--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.osgi.services.remoteserviceadmin.console--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.osgi.services.remoteserviceadmin.proxy--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.bot \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.bot--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.collab.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.collab.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.presence.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.protocol.bittorrent \
mvn-org.eclipse.ecf-org.eclipse.ecf.protocol.bittorrent--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.protocol.msn \
mvn-org.eclipse.ecf-org.eclipse.ecf.protocol.msn--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.bittorrent \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.bittorrent--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.bittorrent.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.bittorrent.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.datashare--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.datashare.nio--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.discovery--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.efs \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.efs--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.httpclient4--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.httpclient4.ssl--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.httpclient45--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.scp \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.scp--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.filetransfer.ssl--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.generic.datashare.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.generic.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.generic.remoteservice.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.jmdns--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.msn \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.msn--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.msn.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.msn.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.r-osgi--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.remoteservice--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.provider.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.asyncproxy--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.eventadmin--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.rest--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.rest.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.rosgi.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.sdk.feature \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.sdk.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.servlet--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.servlet.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.soap--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.soap.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservice.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservices.tooling.pde \
mvn-org.eclipse.ecf-org.eclipse.ecf.remoteservices.tooling.pde--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.server--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.server.generic--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.server.generic.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.sharedobject--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.sharedobject.feature--sources-feature- \
mvn-org.eclipse.ecf-org.eclipse.ecf.ssl--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.storage \
mvn-org.eclipse.ecf-org.eclipse.ecf.storage--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.sync \
mvn-org.eclipse.ecf-org.eclipse.ecf.sync--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.telephony.call \
mvn-org.eclipse.ecf-org.eclipse.ecf.telephony.call--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.telephony.call.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.telephony.call.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.ui \
mvn-org.eclipse.ecf-org.eclipse.ecf.ui--sources- \
mvn-org.eclipse.ecf-org.eclipse.ecf.ui.capabilities \
mvn-org.eclipse.ecf-org.eclipse.ecf.ui.capabilities--sources- \
mvn-org.eclipse.ecf-org.eclipse.osgi.services.remoteserviceadmin--sources- \
mvn-org.eclipse.ecf-org.eclipse.team.ecf.core \
mvn-org.eclipse.ecf-org.eclipse.team.ecf.core--sources- \
mvn-org.eclipse.ecf-org.eclipse.team.ecf.ui \
mvn-org.eclipse.ecf-org.eclipse.team.ecf.ui--sources- \
osgi-ch.ethz.iks.r-osgi.remote.source \
osgi-org.eclipse.ecf.console.feature.source \
osgi-org.eclipse.ecf.console.source \
osgi-org.eclipse.ecf.core \
osgi-org.eclipse.ecf.core.feature.source \
osgi-org.eclipse.ecf.core.source \
osgi-org.eclipse.ecf.core.ssl.feature.source \
osgi-org.eclipse.ecf.datashare.feature.source \
osgi-org.eclipse.ecf.datashare.source \
osgi-org.eclipse.ecf.discovery.feature.source \
osgi-org.eclipse.ecf.discovery.jmdns.feature.source \
osgi-org.eclipse.ecf.discovery.source \
osgi-org.eclipse.ecf.discovery.ui \
osgi-org.eclipse.ecf.discovery.ui.browser \
osgi-org.eclipse.ecf.discovery.ui.browser.source \
osgi-org.eclipse.ecf.discovery.ui.edit \
osgi-org.eclipse.ecf.discovery.ui.edit.source \
osgi-org.eclipse.ecf.discovery.ui.model \
osgi-org.eclipse.ecf.discovery.ui.model.source \
osgi-org.eclipse.ecf.discovery.ui.properties \
osgi-org.eclipse.ecf.discovery.ui.properties.source \
osgi-org.eclipse.ecf.discovery.ui.properties.tabbed \
osgi-org.eclipse.ecf.discovery.ui.properties.tabbed.source \
osgi-org.eclipse.ecf.discovery.ui.source \
osgi-org.eclipse.ecf.discovery.ui.userinput \
osgi-org.eclipse.ecf.discovery.ui.userinput.source \
osgi-org.eclipse.ecf.doc \
osgi-org.eclipse.ecf.doc.source \
osgi-org.eclipse.ecf.docshare \
osgi-org.eclipse.ecf.docshare.feature \
osgi-org.eclipse.ecf.docshare.feature.source \
osgi-org.eclipse.ecf.docshare.source \
osgi-org.eclipse.ecf.eventadmin.feature.source \
osgi-org.eclipse.ecf.filetransfer.feature.source \
osgi-org.eclipse.ecf.filetransfer.httpclient4.feature.source \
osgi-org.eclipse.ecf.filetransfer.httpclient4.ssl.feature.source \
osgi-org.eclipse.ecf.filetransfer.httpclient45.feature.source \
osgi-org.eclipse.ecf.filetransfer.source \
osgi-org.eclipse.ecf.filetransfer.ssl.feature.source \
osgi-org.eclipse.ecf.filetransfer.ui \
osgi-org.eclipse.ecf.filetransfer.ui.source \
osgi-org.eclipse.ecf.identity.source \
osgi-org.eclipse.ecf.osgi.services.distribution.source \
osgi-org.eclipse.ecf.osgi.services.feature.source \
osgi-org.eclipse.ecf.osgi.services.remoteserviceadmin.console.source \
osgi-org.eclipse.ecf.osgi.services.remoteserviceadmin.proxy.source \
osgi-org.eclipse.ecf.osgi.services.remoteserviceadmin.source \
osgi-org.eclipse.ecf.presence.bot \
osgi-org.eclipse.ecf.presence.bot.source \
osgi-org.eclipse.ecf.presence.collab.ui \
osgi-org.eclipse.ecf.presence.collab.ui.source \
osgi-org.eclipse.ecf.presence.feature.source \
osgi-org.eclipse.ecf.presence.source \
osgi-org.eclipse.ecf.presence.ui \
osgi-org.eclipse.ecf.presence.ui.source \
osgi-org.eclipse.ecf.protocol.bittorrent \
osgi-org.eclipse.ecf.protocol.bittorrent.source \
osgi-org.eclipse.ecf.protocol.msn \
osgi-org.eclipse.ecf.protocol.msn.source \
osgi-org.eclipse.ecf.provider.bittorrent \
osgi-org.eclipse.ecf.provider.bittorrent.source \
osgi-org.eclipse.ecf.provider.bittorrent.ui \
osgi-org.eclipse.ecf.provider.bittorrent.ui.source \
osgi-org.eclipse.ecf.provider.datashare.nio.source \
osgi-org.eclipse.ecf.provider.datashare.source \
osgi-org.eclipse.ecf.provider.discovery.source \
osgi-org.eclipse.ecf.provider.filetransfer.efs \
osgi-org.eclipse.ecf.provider.filetransfer.efs.source \
osgi-org.eclipse.ecf.provider.filetransfer.httpclient4.source \
osgi-org.eclipse.ecf.provider.filetransfer.httpclient4.ssl.source \
osgi-org.eclipse.ecf.provider.filetransfer.httpclient45.source \
osgi-org.eclipse.ecf.provider.filetransfer.scp \
osgi-org.eclipse.ecf.provider.filetransfer.scp.source \
osgi-org.eclipse.ecf.provider.filetransfer.source \
osgi-org.eclipse.ecf.provider.filetransfer.ssl.source \
osgi-org.eclipse.ecf.provider.generic.datashare.feature.source \
osgi-org.eclipse.ecf.provider.generic.feature.source \
osgi-org.eclipse.ecf.provider.generic.remoteservice.feature.source \
osgi-org.eclipse.ecf.provider.jmdns.source \
osgi-org.eclipse.ecf.provider.msn \
osgi-org.eclipse.ecf.provider.msn.source \
osgi-org.eclipse.ecf.provider.msn.ui \
osgi-org.eclipse.ecf.provider.msn.ui.source \
osgi-org.eclipse.ecf.provider.r-osgi.source \
osgi-org.eclipse.ecf.provider.remoteservice.source \
osgi-org.eclipse.ecf.provider.source \
osgi-org.eclipse.ecf.provider.ui \
osgi-org.eclipse.ecf.provider.ui.source \
osgi-org.eclipse.ecf.remoteservice.asyncproxy.source \
osgi-org.eclipse.ecf.remoteservice.eventadmin.source \
osgi-org.eclipse.ecf.remoteservice.feature.source \
osgi-org.eclipse.ecf.remoteservice.rest.feature.source \
osgi-org.eclipse.ecf.remoteservice.rest.source \
osgi-org.eclipse.ecf.remoteservice.rosgi.feature.source \
osgi-org.eclipse.ecf.remoteservice.sdk.feature \
osgi-org.eclipse.ecf.remoteservice.sdk.feature.source \
osgi-org.eclipse.ecf.remoteservice.servlet.feature.source \
osgi-org.eclipse.ecf.remoteservice.servlet.source \
osgi-org.eclipse.ecf.remoteservice.soap.feature.source \
osgi-org.eclipse.ecf.remoteservice.soap.source \
osgi-org.eclipse.ecf.remoteservice.source \
osgi-org.eclipse.ecf.remoteservice.ui \
osgi-org.eclipse.ecf.remoteservice.ui.source \
osgi-org.eclipse.ecf.remoteservices.tooling.pde \
osgi-org.eclipse.ecf.remoteservices.tooling.pde.source \
osgi-org.eclipse.ecf.server.generic.feature.source \
osgi-org.eclipse.ecf.server.generic.source \
osgi-org.eclipse.ecf.server.source \
osgi-org.eclipse.ecf.sharedobject.feature.source \
osgi-org.eclipse.ecf.sharedobject.source \
osgi-org.eclipse.ecf.source \
osgi-org.eclipse.ecf.ssl.source \
osgi-org.eclipse.ecf.storage \
osgi-org.eclipse.ecf.storage.source \
osgi-org.eclipse.ecf.sync \
osgi-org.eclipse.ecf.sync.source \
osgi-org.eclipse.ecf.telephony.call \
osgi-org.eclipse.ecf.telephony.call.source \
osgi-org.eclipse.ecf.telephony.call.ui \
osgi-org.eclipse.ecf.telephony.call.ui.source \
osgi-org.eclipse.ecf.ui \
osgi-org.eclipse.ecf.ui.capabilities \
osgi-org.eclipse.ecf.ui.capabilities.source \
osgi-org.eclipse.ecf.ui.source \
osgi-org.eclipse.osgi.services.remoteserviceadmin.source \
osgi-org.eclipse.team.ecf.core \
osgi-org.eclipse.team.ecf.core.source \
osgi-org.eclipse.team.ecf.ui \
osgi-org.eclipse.team.ecf.ui.source"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.eclipse.ecf \
osgi-org.eclipse.ecf.datashare \
osgi-org.eclipse.ecf.discovery \
osgi-org.eclipse.ecf.filetransfer \
osgi-org.eclipse.ecf.identity \
osgi-org.eclipse.ecf.osgi.services.remoteserviceadmin \
osgi-org.eclipse.ecf.presence \
osgi-org.eclipse.ecf.provider.filetransfer \
osgi-org.eclipse.ecf.remoteservice \
osgi-org.eclipse.ecf.remoteservice.asyncproxy \
osgi-org.eclipse.ecf.sharedobject \
osgi-org.eclipse.emf.edit \
osgi-org.eclipse.emf.edit.ui \
osgi-org.eclipse.osgi.services.remoteserviceadmin \
osgi-org.eclipse.pde.core \
osgi-org.eclipse.pde.runtime \
osgi-org.eclipse.pde.ui"

inherit rpm

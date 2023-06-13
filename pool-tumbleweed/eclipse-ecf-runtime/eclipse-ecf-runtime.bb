SUMMARY = "Eclipse Communication Framework (ECF) Eclipse plug-in"
DESCRIPTION = "ECF is a set of frameworks for building communications into applications and \
services. It provides a lightweight, modular, transport-independent, fully \
compliant implementation of the OSGi Remote Services standard."
LICENSE = "Apache-2.0 & EPL-2.0 & BSD-3-Clause"

PV = "3.14.8"

RPM_NAME = "eclipse-ecf-runtime-3.14.8-4.5.noarch.rpm"
RPM_HASH = "128220be42cd8591bcc278b94d291339e1a0aea73ace57e480f91ef4781a4ce8751ffc267eb52276ed8bf0e1687a2bc25d47018072b4102185a63389a324c970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-ecf-runtime \
mvn(org.eclipse.ecf:ch.ethz.iks.r_osgi.remote) \
mvn(org.eclipse.ecf:org.eclipse.ecf.console) \
mvn(org.eclipse.ecf:org.eclipse.ecf.console.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.datashare) \
mvn(org.eclipse.ecf:org.eclipse.ecf.datashare.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.discovery) \
mvn(org.eclipse.ecf:org.eclipse.ecf.discovery.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.discovery.jmdns.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.eventadmin.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.osgi.services.distribution) \
mvn(org.eclipse.ecf:org.eclipse.ecf.osgi.services.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.osgi.services.remoteserviceadmin) \
mvn(org.eclipse.ecf:org.eclipse.ecf.osgi.services.remoteserviceadmin.console) \
mvn(org.eclipse.ecf:org.eclipse.ecf.osgi.services.remoteserviceadmin.proxy) \
mvn(org.eclipse.ecf:org.eclipse.ecf.presence) \
mvn(org.eclipse.ecf:org.eclipse.ecf.presence.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.datashare) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.datashare.nio) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.discovery) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.generic.datashare.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.generic.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.generic.remoteservice.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.jmdns) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.r_osgi) \
mvn(org.eclipse.ecf:org.eclipse.ecf.provider.remoteservice) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.asyncproxy) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.eventadmin) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.rest) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.rest.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.rosgi.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.servlet) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.servlet.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.soap) \
mvn(org.eclipse.ecf:org.eclipse.ecf.remoteservice.soap.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.server) \
mvn(org.eclipse.ecf:org.eclipse.ecf.server.generic) \
mvn(org.eclipse.ecf:org.eclipse.ecf.server.generic.feature) \
mvn(org.eclipse.ecf:org.eclipse.ecf.sharedobject) \
mvn(org.eclipse.ecf:org.eclipse.ecf.sharedobject.feature) \
mvn(org.eclipse.ecf:org.eclipse.osgi.services.remoteserviceadmin) \
osgi(ch.ethz.iks.r_osgi.remote) \
osgi(org.eclipse.ecf.console) \
osgi(org.eclipse.ecf.console.feature) \
osgi(org.eclipse.ecf.datashare) \
osgi(org.eclipse.ecf.datashare.feature) \
osgi(org.eclipse.ecf.discovery) \
osgi(org.eclipse.ecf.discovery.feature) \
osgi(org.eclipse.ecf.discovery.jmdns.feature) \
osgi(org.eclipse.ecf.eventadmin.feature) \
osgi(org.eclipse.ecf.osgi.services.distribution) \
osgi(org.eclipse.ecf.osgi.services.feature) \
osgi(org.eclipse.ecf.osgi.services.remoteserviceadmin) \
osgi(org.eclipse.ecf.osgi.services.remoteserviceadmin.console) \
osgi(org.eclipse.ecf.osgi.services.remoteserviceadmin.proxy) \
osgi(org.eclipse.ecf.presence) \
osgi(org.eclipse.ecf.presence.feature) \
osgi(org.eclipse.ecf.provider) \
osgi(org.eclipse.ecf.provider.datashare) \
osgi(org.eclipse.ecf.provider.datashare.nio) \
osgi(org.eclipse.ecf.provider.discovery) \
osgi(org.eclipse.ecf.provider.generic.datashare.feature) \
osgi(org.eclipse.ecf.provider.generic.feature) \
osgi(org.eclipse.ecf.provider.generic.remoteservice.feature) \
osgi(org.eclipse.ecf.provider.jmdns) \
osgi(org.eclipse.ecf.provider.r_osgi) \
osgi(org.eclipse.ecf.provider.remoteservice) \
osgi(org.eclipse.ecf.remoteservice) \
osgi(org.eclipse.ecf.remoteservice.asyncproxy) \
osgi(org.eclipse.ecf.remoteservice.eventadmin) \
osgi(org.eclipse.ecf.remoteservice.feature) \
osgi(org.eclipse.ecf.remoteservice.rest) \
osgi(org.eclipse.ecf.remoteservice.rest.feature) \
osgi(org.eclipse.ecf.remoteservice.rosgi.feature) \
osgi(org.eclipse.ecf.remoteservice.servlet) \
osgi(org.eclipse.ecf.remoteservice.servlet.feature) \
osgi(org.eclipse.ecf.remoteservice.soap) \
osgi(org.eclipse.ecf.remoteservice.soap.feature) \
osgi(org.eclipse.ecf.server) \
osgi(org.eclipse.ecf.server.generic) \
osgi(org.eclipse.ecf.server.generic.feature) \
osgi(org.eclipse.ecf.sharedobject) \
osgi(org.eclipse.ecf.sharedobject.feature) \
osgi(org.eclipse.osgi.services.remoteserviceadmin)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi(javax.xml) \
osgi(org.eclipse.ecf) \
osgi(org.eclipse.ecf.identity) \
osgi(org.objectweb.asm)"

inherit rpm

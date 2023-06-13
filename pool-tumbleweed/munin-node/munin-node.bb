SUMMARY = "Network-wide graphing framework (node)"
DESCRIPTION = "Munin is a highly flexible and powerful solution used to create graphs of \
virtually everything imaginable throughout your network, while still \
maintaining a rattling ease of installation and configuration. \
 \
This package contains node software. You should install it on all the nodes \
in your network. It will know how to extract all sorts of data from the \
node it runs on, and will wait for the gatherer to request this data for \
further processing. \
 \
It includes a range of plugins capable of extracting common values such as \
cpu usage, network usage, load average, and so on. Creating your own plugins \
which are capable of extracting other system-specific values is very easy, \
and is often done in a matter of minutes. You can also create plugins which \
relay information from other devices in your network that can't run Munin, \
such as a switch or a server running another operating system, by using \
SNMP or similar technology. \
 \
Munin is written in Perl, and relies heavily on Tobi Oetiker's excellent \
RRDtool. To see a real example of Munin in action, take a peek at \
<http://www.linpro.no/projects/munin/example/>."
LICENSE = "GPL-2.0-only"

PV = "2.0.72"

RPM_NAME = "munin-node-2.0.72-2.1.noarch.rpm"
RPM_HASH = "5a6bec231b71e20bb23d27b265c6c645f2b5479e6be6d5ea89e7ed87ec28e575bea26dc31c6ebc8927f068059d77c8dd5a9f8b07e51f3721ef31e3c02d370b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(munin-node) \
munin-node \
perl(Munin::Common::Config) \
perl(Munin::Common::Daemon) \
perl(Munin::Common::Defaults) \
perl(Munin::Common::DictFile) \
perl(Munin::Common::SyncDictFile) \
perl(Munin::Common::TLS) \
perl(Munin::Common::TLSClient) \
perl(Munin::Common::TLSServer) \
perl(Munin::Common::Timeout) \
perl(Munin::Node::Config) \
perl(Munin::Node::Configure::Debug) \
perl(Munin::Node::Configure::History) \
perl(Munin::Node::Configure::HostEnumeration) \
perl(Munin::Node::Configure::Plugin) \
perl(Munin::Node::Configure::PluginList) \
perl(Munin::Node::Logger) \
perl(Munin::Node::OS) \
perl(Munin::Node::SNMPConfig) \
perl(Munin::Node::Server) \
perl(Munin::Node::Service) \
perl(Munin::Node::Session) \
perl(Munin::Node::SpoolReader) \
perl(Munin::Node::SpoolWriter) \
perl(Munin::Node::Utils) \
perl(Munin::Plugin) \
perl(Munin::Plugin::Pgsql) \
perl(Munin::Plugin::SNMP)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/ruby \
group(nobody) \
group(www) \
perl-HTML-Template \
perl-Log-Log4perl \
perl-Net-SNMP \
perl-Net-SSLeay \
perl-Net-Server \
perl-base \
perl-libwww-perl \
ps \
python \
ruby \
shadow \
sysstat \
user(nobody)"

inherit rpm

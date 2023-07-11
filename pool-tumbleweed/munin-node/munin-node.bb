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

RPM_NAME = "munin-node-2.0.72-3.2.noarch.rpm"
RPM_HASH = "e18ff9862592ad215a3268973785db51f3f1b73fb3831de3a907bd2ff88e88f6c37ae6a7be42a925493ebc5c52393694f04cbdc199aefb3ab01fd3928455a285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-munin-node \
munin-node \
perl-Munin--Common--Config \
perl-Munin--Common--Daemon \
perl-Munin--Common--Defaults \
perl-Munin--Common--DictFile \
perl-Munin--Common--SyncDictFile \
perl-Munin--Common--TLS \
perl-Munin--Common--TLSClient \
perl-Munin--Common--TLSServer \
perl-Munin--Common--Timeout \
perl-Munin--Node--Config \
perl-Munin--Node--Configure--Debug \
perl-Munin--Node--Configure--History \
perl-Munin--Node--Configure--HostEnumeration \
perl-Munin--Node--Configure--Plugin \
perl-Munin--Node--Configure--PluginList \
perl-Munin--Node--Logger \
perl-Munin--Node--OS \
perl-Munin--Node--SNMPConfig \
perl-Munin--Node--Server \
perl-Munin--Node--Service \
perl-Munin--Node--Session \
perl-Munin--Node--SpoolReader \
perl-Munin--Node--SpoolWriter \
perl-Munin--Node--Utils \
perl-Munin--Plugin \
perl-Munin--Plugin--Pgsql \
perl-Munin--Plugin--SNMP"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/ruby \
/usr/bin/sh \
group-nobody \
group-www \
perl-HTML-Template \
perl-Log-Log4perl \
perl-Net-SNMP \
perl-Net-SSLeay \
perl-Net-Server \
perl-base \
perl-libwww-perl \
ps \
ruby \
shadow \
sysstat \
user-nobody"

inherit rpm

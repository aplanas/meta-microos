SUMMARY = "Network-wide graphing framework (grapher/gatherer)"
DESCRIPTION = "Munin is a highly flexible and powerful solution used to create graphs of \
virtually everything imaginable throughout your network, while still \
maintaining a rattling ease of installation and configuration. \
 \
This package contains the grapher/gatherer. You will only need one instance of \
it in your network. It will periodically poll all the nodes in your network \
it's aware of for data, which it in turn will use to create graphs and HTML \
pages, suitable for viewing with your graphical web browser of choice. \
 \
Munin is written in Perl, and relies heavily on Tobi Oetiker's excellent \
RRDtool."
LICENSE = "GPL-2.0-only"

PV = "2.0.72"

RPM_NAME = "munin-2.0.72-3.2.noarch.rpm"
RPM_HASH = "76e3845b08040206bf14b541de8cb7feaf6bbc2a369b4c2aaf61bdfa75e4c9b74fd9943d6371720a8aafbd755a7e79861d9f28ba58fe2108f673989c2fdc1bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-munin \
munin \
perl-Munin--Master--Config \
perl-Munin--Master--GraphOld \
perl-Munin--Master--Group \
perl-Munin--Master--GroupRepository \
perl-Munin--Master--HTMLConfig \
perl-Munin--Master--HTMLOld \
perl-Munin--Master--Host \
perl-Munin--Master--LimitsOld \
perl-Munin--Master--Logger \
perl-Munin--Master--Node \
perl-Munin--Master--ProcessManager \
perl-Munin--Master--Update \
perl-Munin--Master--UpdateWorker \
perl-Munin--Master--Utils \
perl-Munin--Master--Worker \
perl-URI--munin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
perl-Date-Manip \
perl-FastCGI \
perl-File-Copy-Recursive \
perl-HTML-Template \
perl-IO-Socket-INET6 \
perl-Log-Log4perl \
perl-Munin--Common--Defaults \
perl-Net-SNMP \
perl-Net-SSLeay \
perl-Net-Server \
perl-URI \
perl-base \
perl-rrdtool \
rrdtool \
shadow \
spawn-fcgi"

inherit rpm

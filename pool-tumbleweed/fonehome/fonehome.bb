SUMMARY = "Remote access to machines behind firewalls"
DESCRIPTION = "fonehome allows remote access to machines behind firewalls using SSH \
port forwarding. \
 \
The fonehome client is a daemon that runs on remote client machines that \
are behind some firewall that you either do not control or do not want \
to reconfigure, but which does allow normal outgoing TCP connections. The \
clients use SSH to connect to a fonehome server to which you have direct \
access. The SSH connections include reverse-forwarded TCP ports which in \
turn allow you to connect back to the remote machine using the included \
fhssh(1) and fhscp(1) utilities. \
 \
This setup is useful in situations where you have several machines \
deployed in the field and want to maintain access to them from a central \
operations server."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "fonehome-1.2.2-1.5.noarch.rpm"
RPM_HASH = "fd5302a123383976f264aa3f9057d786c48188c06bac6f8355466750ab6fd88cd41a257c7f8434ae731e4b0d38603da4719d0f9be1dc8f5b17955d677f8023b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonehome \
fonehome"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bc \
findutils \
openssh \
sed \
systemd"

inherit rpm

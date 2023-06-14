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

RPM_NAME = "fonehome-1.2.2-1.4.noarch.rpm"
RPM_HASH = "5d4f70f16673c4f996c0fb23829e9ed9c1f9d90bb4913e67b54b800a7e4ed1a6b8d8bb2a9e313ca7d4f1e16cee0f17a8f1c90e3adb7a43b2ced66e07a6d53666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonehome \
fonehome"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
bc \
findutils \
openssh \
sed \
systemd"

inherit rpm

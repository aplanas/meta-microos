SUMMARY = "Realtime filesystem monitoring program"
DESCRIPTION = "iWatch monitor the filesystem's integrity in realtime and will send \
alarm immediately to the system administrator when there is any changes \
in the monitored filesystem. iWatch is written in Perl and based on \
inotify, a file change notification system, a kernel feature that \
allows applications to request the monitoring of a set of files against \
a list of events. \
 \
Currently it can: \
 \
- run in command line mode as well as in daemon mode \
 \
- using an easy xml configuration file \
 \
- can watch directory recursively and watch new created directory \
 \
- can have a list of exceptions \
 \
- can use regex to compare the file/directory name \
 \
- can execute command if an event occures \
 \
- send email \
 \
- syslog \
 \
- print time stamp"
LICENSE = "GPL-2.0+"

PV = "0.2.2"

RPM_NAME = "iwatch-0.2.2-16.16.noarch.rpm"
RPM_HASH = "97494564284f66f26012f94f48c193c61b63cdb4b3f6bf4a8be47b34d3dc805b53b51e68d74c0631999966a88afeb6f0c09a8ce1c41fc4639e76cfc1ed9739c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-iwatch \
iwatch"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Event \
perl-Linux-Inotify2 \
perl-Mail-Sendmail \
perl-XML-LibXML \
perl-XML-SimpleObject-LibXML"

inherit rpm

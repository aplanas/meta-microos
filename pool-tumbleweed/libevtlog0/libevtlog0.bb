SUMMARY = "Syslog-ng event logger library runtime"
DESCRIPTION = "The EventLog library aims to be a replacement of the simple syslog() \
API provided on UNIX systems. The major difference between EventLog and \
syslog is that EventLog tries to add structure to messages. \
 \
EventLog provides an interface to build, format and output an event \
record. The exact format and output method can be customized by the \
administrator via a configuration file. \
 \
This package provides the runtime part of the library. \
 \
The package may contain Novell/SUSE specific modifications/extensions, \
please report problems using Bugzilla at https://bugzilla.novell.com/ \
before you contact the authors. \
 \
The official home page of syslog-ng is: \
http://www.balabit.com/network-security/syslog-ng/"
LICENSE = "BSD-3-Clause"

PV = "0.2.13"

RPM_NAME = "libevtlog0-0.2.13-2.23.aarch64.rpm"
RPM_HASH = "dcf2a38b3c0555d74afc3b2f5e607b5d5d186e055581ae1cbfb6eb6daee0a2992c10d506004d5fcc1b3b4587584c41418d8708d56b524caee8b79a60634f73e5"

RPROVIDES:${PN} += "libevtlog.so.0 \
libevtlog0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

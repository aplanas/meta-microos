SUMMARY = "Syslog-ng event logger library development files"
DESCRIPTION = "The EventLog library aims to be a replacement of the simple syslog() \
API provided on UNIX systems. The major difference between EventLog and \
syslog is that EventLog tries to add structure to messages. \
 \
EventLog provides an interface to build, format and output an event \
record. The exact format and output method can be customized by the \
administrator via a configuration file. \
 \
This package provides the development files. The package may contain \
Novell/SUSE specific modifications/extensions, please report problems \
using Bugzilla at https://bugzilla.novell.com/ before you contact the \
authors. \
 \
The official home page of syslog-ng is: \
http://www.balabit.com/network-security/syslog-ng/"
LICENSE = "BSD-3-Clause"

PV = "0.2.13"

RPM_NAME = "libevtlog-devel-0.2.13-2.24.aarch64.rpm"
RPM_HASH = "56fe132cfdaba8ee826e66e67330d03f6af8964240530c183c51e1663537d65b62af2370072cdb92d41afaed1fef2e6b94dc009078d59d6ee4b7842b8ee083a3"

RPROVIDES:${PN} += "libevtlog-devel \
pkgconfig-eventlog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libevtlog0"

inherit rpm

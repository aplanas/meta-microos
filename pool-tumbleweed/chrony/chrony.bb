SUMMARY = "System Clock Synchronization Client and Server"
DESCRIPTION = "Chrony is an implementation of the Network Time Protocol (NTP). It can \
synchronize the system clock with NTP servers, reference clocks (e.g. a \
GPS receiver), and manual input using wristwatch and keyboard. It can \
also operate as an NTPv4 (RFC 5905) server and peer to provide a time \
service to other computers in the network. \
 \
Chrony consists of two programs: chronyd and chronyc. \
 \
Chronyd is a daemon which runs in the background on the system. It \
obtains measurements of the system clock’s offset relative to time \
servers on other systems via the network and adjusts the system time \
accordingly. For isolated systems, the user can periodically enter the \
correct time by hand (using chronyc). In either case, chronyd \
determines the rate at which the computer gains or loses time, and \
compensates for this. Chronyd can act as either a client or a server. \
 \
Chronyc provides a user interface to chronyd for monitoring its \
performance and configuring various settings. It can do so while \
running on the same computer as the chronyd instance it is controlling \
or a different computer."
LICENSE = "GPL-2.0-only"

PV = "4.4"

RPM_NAME = "chrony-4.4-1.1.aarch64.rpm"
RPM_HASH = "ea858a04a68fdb471561ce2de23eca65db5d3966f22328c5cc6c34d39c78377c14d1d7e36903a5211d368b8965f514929712132e71a05cc61d7c8e933904e83f"

RPROVIDES:${PN} += "chrony \
config-chrony \
group-chrony \
ntp-daemon \
user-chrony"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
chrony-pool \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libedit.so.0 \
libgnutls.so.30 \
libm.so.6 \
libnettle.so.8 \
libseccomp.so.2 \
sysuser-shadow"

inherit rpm

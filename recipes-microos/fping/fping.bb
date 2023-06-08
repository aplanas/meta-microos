SUMMARY = "A program to ping multiple hosts"
DESCRIPTION = "FPing is a ping-like program that uses the Internet Control Message \
Protocol (ICMP) echo request to determine if a target host is \
responding. FPing differs from ping in that you can specify any number \
of targets on the command line or specify a file containing a list of \
targets to ping. Instead of sending pings to one target until it times \
out or replies, FPing sends a ping packet and moves on to the next \
target in a round-robin fashion. \
 \
In the default mode, if a target replies, it is noted and removed from \
the list of targets to check. If a target does not respond within a \
certain time limit or retry limit, it is designated as unreachable. \
FPing also supports sending a specified number of pings to a target or \
looping indefinitely (as in ping). \
 \
Unlike ping, FPing is meant to be used in scripts. Its output is \
designed to be easy to parse."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "fping-5.1-1.7.aarch64.rpm"
RPM_HASH = "8f481b58cd01ec7e5ff2afe27edd839cd7e18823dbbed3237bcd83927612d976d719bbfac686a95492cd7513296d8ec42e6acb3868fed384c9af93590429d164"

RPROVIDES:${PN} += "fping fping(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) permissions"

inherit rpm

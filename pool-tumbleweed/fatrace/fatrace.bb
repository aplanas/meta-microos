SUMMARY = "System wide file access event reporting utility"
DESCRIPTION = "The fatrace trace uses fanotify, a couple of /proc lookups and some \
glue to trace file access events system-wide, in an effort to \
identify processes which keep waking up the disk even when the \
computer is idle. \
 \
By default, it monitors the whole system, i.e. all mounts except \
virtual ones like /proc, tmpfs, etc. It can be told to monitor just \
the mount of the current directory. The log can be written to a file \
and runtime be capped. Optional time stamps and PID filters are also \
provided."
LICENSE = "GPL-3.0-or-later"

PV = "0.17.0"

RPM_NAME = "fatrace-0.17.0-1.2.aarch64.rpm"
RPM_HASH = "d2d1538b3ea2fecc556ab685b94b8865cc03afeb170439c17580fc34e49d7ebaae8503324df6d0458ae924a975d488dd1729f27775917def351c6c55ed0ff062"

RPROVIDES:${PN} += "fatrace"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

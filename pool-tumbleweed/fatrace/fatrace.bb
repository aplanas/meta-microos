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

RPM_NAME = "fatrace-0.17.0-1.3.aarch64.rpm"
RPM_HASH = "58671828647e6d555774dd77ed1ce1b323390fcc4528b802b1ba690144d13e9a378dab37c1cbec93912296059a3e8aa10878da27eca681153262fd719733932f"

RPROVIDES:${PN} += "fatrace"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

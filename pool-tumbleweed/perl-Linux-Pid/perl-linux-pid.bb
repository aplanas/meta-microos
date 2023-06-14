SUMMARY = "Get the native PID and the PPID on Linux"
DESCRIPTION = "Why should one use a module to get the PID and the PPID of a process where \
there are the '$$' variable and the 'getppid()' builtin ? (Not mentioning \
the equivalent 'POSIX::getpid()' and 'POSIX::getppid()' functions.) \
 \
In fact, this is useful on Linux, with multithreaded programs. Linux' C \
library, using the linux thread model, returns different values of the PID \
and the PPID from different threads. (Other thread models such as NPTL \
don't have the same behaviour). This module forces perl to call the \
underlying C functions 'getpid()' and 'getppid()'."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.04"

RPM_NAME = "perl-Linux-Pid-0.04-3.37.aarch64.rpm"
RPM_HASH = "0a8bae2289273006697f5f45524b8d0d09345aa5cfcaccc22d398a6049ab7ad4aec02cde0fea0db56767b34ac7c74cc5e82ef904674090be0588ba017b51953c"

RPROVIDES:${PN} += "perl-Linux--Pid \
perl-Linux-Pid"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm

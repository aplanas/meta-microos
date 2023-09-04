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

RPM_NAME = "perl-Linux-Pid-0.04-3.39.aarch64.rpm"
RPM_HASH = "f19e5e28c069ab31a0098b13278eef4083ab8563f31815ef01ea9cae011d047589bcd47bf98dac5cc33d11c244f8e34c13163c48dee0d0e4b5df3465008366a1"

RPROVIDES:${PN} += "perl-Linux--Pid \
perl-Linux-Pid"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

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

RPM_NAME = "perl-Linux-Pid-0.04-3.38.aarch64.rpm"
RPM_HASH = "6f1bdbbbeecc4065c0f06da3756266e8ddee503768d9ba6ae661a9b55bc77bace23acb40174fec6e8760868524399b0321e13a2081b6bdf5315054fcbdf97b33"

RPROVIDES:${PN} += "perl-Linux--Pid \
perl-Linux-Pid"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

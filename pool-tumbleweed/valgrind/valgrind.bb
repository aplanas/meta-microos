SUMMARY = "Memory Management Debugger"
DESCRIPTION = "Valgrind checks all memory operations in an application, like read, \
write, malloc, new, free, and delete. Valgrind can find uses of \
uninitialized memory, access to already freed memory, overflows, \
illegal stack operations, memory leaks, and any illegal \
new/malloc/free/delete commands. Another program in the package is \
'cachegrind,' a profiler based on the valgrind engine. \
 \
To use valgrind you should compile your application with '-g -O0' \
compiler options. Afterwards you can use it with: \
 \
valgrind --tool=memcheck --sloppy-malloc=yes --leak-check=yes \
--db-attach=yes my_application, for example. \
 \
More valgrind options can be listed via 'valgrind --help'. There is \
also complete documentation in the /usr/share/doc/packages/valgrind/ \
directory. A debugged application runs slower and needs much more \
memory, but is usually still usable. Valgrind is still in development, \
but it has been successfully used to optimize several KDE applications."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "valgrind-3.21.0-2.1.aarch64.rpm"
RPM_HASH = "e4bafe58e96c5bdb8c765d90850d4f9b231c3931988a9cb19f06a7f63054e765a7f7b60c8727ce771913e48057351bcb6397049bc5a7ca2dc6988ef8dc3435e9"

RPROVIDES:${PN} += "callgrind \
valgrind"

RDEPENDS:${PN} += "-glibc >= 2.38 with glibc < 2.39 \
/usr/bin/env \
/usr/bin/perl \
libc.so.6"

inherit rpm

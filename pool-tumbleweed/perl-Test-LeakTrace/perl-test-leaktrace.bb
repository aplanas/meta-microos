SUMMARY = "Traces memory leaks"
DESCRIPTION = "'Test::LeakTrace' provides several functions that trace memory leaks. This \
module scans arenas, the memory allocation system, so it can detect any \
leaked SVs in given blocks. \
 \
*Leaked SVs* are SVs which are not released after the end of the scope they \
have been created. These SVs include global variables and internal caches. \
For example, if you call a method in a tracing block, perl might prepare a \
cache for the method. Thus, to trace true leaks, 'no_leaks_ok()' and \
'leaks_cmp_ok()' executes a block more than once."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-LeakTrace-0.17-1.14.aarch64.rpm"
RPM_HASH = "4c3b2ba7b3ef4e4bb292af99b81bf2f06bda9ee221d8b4b9efdc32d247e6f230ba01047bfbc62ad924c3e25b318c3bfdb2fa2c8ac4a90d185f560fc03cdf48fa"

RPROVIDES:${PN} += "perl-Test--LeakTrace \
perl-Test--LeakTrace--Script \
perl-Test-LeakTrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

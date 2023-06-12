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

RPM_NAME = "perl-Test-LeakTrace-0.17-1.12.aarch64.rpm"
RPM_HASH = "9d942f0123c7e40d2c09ce065370ad23672fbb26afdfb52dc6d8dc6e283c88a593262df25c94944fddc79f2e0271826bcd246c681659240ba405b8adeb6716b6"

RPROVIDES:${PN} += "perl(Test::LeakTrace) \
perl(Test::LeakTrace::Script) \
perl-Test-LeakTrace \
perl-Test-LeakTrace(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

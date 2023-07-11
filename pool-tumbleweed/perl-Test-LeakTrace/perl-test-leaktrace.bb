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

RPM_NAME = "perl-Test-LeakTrace-0.17-1.13.aarch64.rpm"
RPM_HASH = "f9dc60a7ad20a5573c76cbaae2bf65bec682101ca4e3c734b2ef8b091e4a19682f39e252eb6bef3abb30bbf21e5f3714d955ca428af676d3fc0a532126bafe2a"

RPROVIDES:${PN} += "perl-Test--LeakTrace \
perl-Test--LeakTrace--Script \
perl-Test-LeakTrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

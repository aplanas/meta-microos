SUMMARY = "Warns and dies noisily with stack backtraces"
DESCRIPTION = "This module is meant as a debugging aid. It can be used to make a script \
complain loudly with stack backtraces when warn()ing or die()ing. \
 \
Here are how stack backtraces produced by this module looks: \
 \
   \
  $ perl -MCarp::Always -e 'sub f { die 'arghh' }; sub g { f }; g' \
  arghh at -e line 1 \
          main::f() called at -e line 1 \
          main::g() called at -e line 1 \
 \
   \
  $ perl -MCarp::Always -w -e 'sub f { $a = shift; @a = @$a };' \\ \
                           -e 'sub g { f(undef) }; g' \
  Use of uninitialized value in array dereference at -e line 1 \
          main::f('undef') called at -e line 2 \
          main::g() called at -e line 2 \
 \
In the implementation, the Carp module does the heavy work, through \
'longmess()'. The actual implementation sets the signal hooks \
$SIG{__WARN__} and $SIG{__DIE__} to emit the stack backtraces. \
 \
Also, all uses of 'carp' and 'croak' are made verbose, behaving like \
'cluck' and 'confess'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Carp-Always-0.16-1.17.noarch.rpm"
RPM_HASH = "55182925b0fb0778f683e0fd78071e44ab055822e8d2b5ad633b7070ea48e3f3f3c764b49cc8be24e3ea149aac4f5a84ab3827086c8566be48ce55ca14f0eb15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Always \
perl-Carp-Always"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

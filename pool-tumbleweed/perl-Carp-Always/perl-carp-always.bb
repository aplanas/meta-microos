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

RPM_NAME = "perl-Carp-Always-0.16-1.18.noarch.rpm"
RPM_HASH = "f80fd73fe1767c7710a599923e01e9314e74340e1a173ef480498973f1018b479e540d4eaa962720a1d9ad25c2792919ed739c9183b5eea06a94ba082e0f42a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Always \
perl-Carp-Always"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

SUMMARY = "Meatier versions of caller"
DESCRIPTION = "* caller_cv($level) \
 \
'caller_cv' gives you the coderef of the subroutine being invoked at the \
call frame indicated by the value of $level \
 \
* caller_args($level) \
 \
Returns the arguments passed into the caller at level $level \
 \
* caller_vars( $level, $names ) \
  =item called_with($level, $names) \
 \
'called_with' returns a list of references to the original arguments to the \
subroutine at $level. if $names is true, the names of the variables will be \
returned instead \
 \
constants are returned as 'undef' in both cases \
 \
* called_as_method($level) \
 \
'called_as_method' returns true if the subroutine at $level was called as a \
method."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.07"

RPM_NAME = "perl-Devel-Caller-2.07-1.3.aarch64.rpm"
RPM_HASH = "3d48ae25908dda403e90dbc7df9abab5ebaea07c926cba6f0ce13e207f849e8fdb5e93bf72a1c2dd94f568e4370df9a2bde28f1a732cbbd5881aac186a0f4833"

RPROVIDES:${PN} += "perl-DB \
perl-Devel--Caller \
perl-Devel-Caller"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-PadWalker"

inherit rpm

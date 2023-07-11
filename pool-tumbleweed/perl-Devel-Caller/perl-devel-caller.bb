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

RPM_NAME = "perl-Devel-Caller-2.07-1.2.aarch64.rpm"
RPM_HASH = "3833971f65dd02cce23cf8feb0227004e1d059ea04fa220aa41e13b0f52e754d950e836f6a4b931441a3e8a3065b26d6dc946ad6b65f21ae27e08a011a61c9e1"

RPROVIDES:${PN} += "perl-DB \
perl-Devel--Caller \
perl-Devel-Caller"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-PadWalker"

inherit rpm

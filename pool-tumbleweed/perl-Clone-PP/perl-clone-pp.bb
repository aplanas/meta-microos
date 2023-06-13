SUMMARY = "Recursively copy Perl datatypes"
DESCRIPTION = "This module provides a general-purpose clone function to make deep copies \
of Perl data structures. It calls itself recursively to copy nested hash, \
array, scalar and reference types, including tied variables and objects. \
 \
The clone() function takes a scalar argument to copy. To duplicate arrays \
or hashes, pass them in by reference: \
 \
  my $copy = clone(\\@array);    my @copy = @{ clone(\\@array) }; \
  my $copy = clone(\\%hash);     my %copy = %{ clone(\\%hash) }; \
 \
The clone() function also accepts an optional second parameter that can be \
used to limit the depth of the copy. If you pass a limit of 0, clone will \
return the same value you supplied; for a limit of 1, a shallow copy is \
constructed; for a limit of 2, two layers of copying are done, and so on. \
 \
  my $shallow_copy = clone( $item, 1 ); \
 \
To allow objects to intervene in the way they are copied, the clone() \
function checks for a couple of optional methods. If an object provides a \
method named 'clone_self', it is called and the result returned without \
further processing. Alternately, if an object provides a method named \
'clone_init', it is called on the copied object before it is returned."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Clone-PP-1.08-1.12.noarch.rpm"
RPM_HASH = "3ff9572fcf15c286cb5631239ebc2b4689e4058d73b2ac18b29d47d2773b8d75631f4f86bc152febefd5dc9be2c5b10c1ae9577435f9ff6467ba34d73e6a275e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Clone::PP) \
perl-Clone-PP"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

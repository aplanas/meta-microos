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

RPM_NAME = "perl-Clone-PP-1.08-1.14.noarch.rpm"
RPM_HASH = "68d198a0ef1e00433c545ce64498c318df706bb026ddd0584af252060fc64178ad4516c4e315444311de1bd8f9b54d8b2e88c1a0063e6afaff8366f285d2bd6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Clone--PP \
perl-Clone-PP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

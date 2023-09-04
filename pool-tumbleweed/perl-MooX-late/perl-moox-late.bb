SUMMARY = "Easily translate Moose code to Moo"
DESCRIPTION = "Moo is a light-weight object oriented programming framework which aims to \
be compatible with Moose. It does this by detecting when Moose has been \
loaded, and automatically 'inflating' its classes and roles to full Moose \
classes and roles. This way, Moo classes can consume Moose roles, Moose \
classes can extend Moo classes, and so forth. \
 \
However, the surface syntax of Moo differs somewhat from Moose. For example \
the 'isa' option when defining attributes in Moose must be either a string \
or a blessed Moose::Meta::TypeConstraint object; but in Moo must be a \
coderef. These differences in surface syntax make porting code from Moose \
to Moo potentially tricky. MooX::late provides some assistance by enabling \
a slightly more Moosey surface syntax. \
 \
MooX::late does the following: \
 \
* 1. \
 \
Supports 'isa => $stringytype'. \
 \
* 2. \
 \
Supports 'does => $rolename' . \
 \
* 3. \
 \
Supports 'lazy_build => 1'. \
 \
* 4. \
 \
Exports 'blessed' and 'confess' functions to your namespace. \
 \
* 5. \
 \
Handles native attribute traits. \
 \
Five features. It is not the aim of 'MooX::late' to make every aspect of \
Moo behave exactly identically to Moose. It's just going after the \
low-hanging fruit. So it does five things right now, and I promise that \
future versions will never do more than seven. \
 \
Previous releases of MooX::late added support for 'coerce => 1' and \
'default => $nonref'. These features have now been added to Moo itself, so \
MooX::late no longer has to deal with them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100"

RPM_NAME = "perl-MooX-late-0.100-2.12.noarch.rpm"
RPM_HASH = "2f6e6c7c236af4dcfa1921acf1e1d1d063a798b16ef4a6d8028279456082d1b3ad8804be897a1150011249d6e6c26dcc3b20f5306c7bfeee636dd41c56178f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--late \
perl-MooX--late--DefinitionContext \
perl-MooX-late"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo \
perl-Sub--HandlesVia \
perl-Type--Utils"

inherit rpm

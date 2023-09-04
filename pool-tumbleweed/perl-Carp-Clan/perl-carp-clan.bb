SUMMARY = "Report errors from perspective of caller of a 'clan' of modules"
DESCRIPTION = "This module is based on ''Carp.pm'' from Perl 5.005_03. It has been \
modified to skip all package names matching the pattern given in the 'use' \
statement inside the ''qw()'' term (or argument list). \
 \
Suppose you have a family of modules or classes named 'Pack::A', 'Pack::B' \
and so on, and each of them uses ''Carp::Clan qw(^Pack::);'' (or at least \
the one in which the error or warning gets raised). \
 \
Thus when for example your script 'tool.pl' calls module 'Pack::A', and \
module 'Pack::A' calls module 'Pack::B', an exception raised in module \
'Pack::B' will appear to have originated in 'tool.pl' where 'Pack::A' was \
called, and not in 'Pack::A' where 'Pack::B' was called, as the unmodified \
''Carp.pm'' would try to make you believe ':-)'. \
 \
This works similarly if 'Pack::B' calls 'Pack::C' where the exception is \
raised, et cetera. \
 \
In other words, this blames all errors in the ''Pack::*'' modules on the \
user of these modules, i.e., on you. ';-)' \
 \
The skipping of a clan (or family) of packages according to a pattern \
describing its members is necessary in cases where these modules are not \
classes derived from each other (and thus when examining '@ISA' - as in the \
original ''Carp.pm'' module - doesn't help). \
 \
The purpose and advantage of this is that a 'clan' of modules can work \
together (and call each other) and throw exceptions at various depths down \
the calling hierarchy and still appear as a monolithic block (as though \
they were a single module) from the perspective of the caller. \
 \
In case you just want to ward off all error messages from the module in \
which you ''use Carp::Clan'', i.e., if you want to make all error messages \
or warnings to appear to originate from where your module was called (this \
is what you usually used to ''use Carp;'' for ';-)'), instead of in your \
module itself (which is what you can do with a 'die' or 'warn' anyway), you \
do not need to provide a pattern, the module will automatically provide the \
correct one for you. \
 \
I.e., just ''use Carp::Clan;'' without any arguments and call 'carp' or \
'croak' as appropriate, and they will automatically defend your module \
against all blames! \
 \
In other words, a pattern is only necessary if you want to make several \
modules (more than one) work together and appear as though they were only \
one."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.08"

RPM_NAME = "perl-Carp-Clan-6.08-1.17.noarch.rpm"
RPM_HASH = "ae34a0a53891474be261889f022544103be4c565d00eb6c2b2955345579210f24f5d3753343a9c834574fc6a85fe23775eba655d5036ab20279c1daca76d96f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Clan \
perl-Carp-Clan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

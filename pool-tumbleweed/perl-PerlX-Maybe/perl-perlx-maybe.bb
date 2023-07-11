SUMMARY = "Return a pair only if they are both defined"
DESCRIPTION = "Moose classes (and some other classes) distinguish between an attribute \
being unset and the attribute being set to undef. Supplying a constructor \
arguments like this: \
 \
 my $bob = Person->new( \
    name => $name, \
    age => $age, \
 ); \
 \
Will result in the 'name' and 'age' attributes possibly being set to undef \
(if the corresponding '$name' and '$age' variables are not defined), which \
may violate the Person class' type constraints. \
 \
(Note: if you are the _author_ of the class in question, you can solve this \
using MooseX::UndefTolerant. However, some of us are stuck using \
non-UndefTolerant classes written by third parties.) \
 \
To ensure that the Person constructor does not try to set a name or age at \
all when they are undefined, ugly looking code like this is often used: \
 \
 my $bob = Person->new( \
    defined $name ? (name => $name) : (), \
    defined $age ? (age => $age) : (), \
 ); \
 \
or: \
 \
 my $bob = Person->new( \
    (name => $name) x!!(defined $name), \
    (age  => $age)  x!!(defined $age), \
 ); \
 \
A slightly more elegant solution is the 'maybe' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.202"

RPM_NAME = "perl-PerlX-Maybe-1.202-1.8.noarch.rpm"
RPM_HASH = "a513ac692be0be57b70a7c9e4256e8d32ee02741d2477cf5ccb72a894ef4d3b0f55efdd5f8e9b90aec60d9ae6ae9aa8fc5ef185aa8c54fce846a2c8ddf7dd30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlX--Maybe \
perl-PerlX-Maybe \
perl-Syntax--Feature--Maybe"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

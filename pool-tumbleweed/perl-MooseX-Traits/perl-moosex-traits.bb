SUMMARY = "Automatically apply roles at object creation time"
DESCRIPTION = "Often you want to create components that can be added to a class \
arbitrarily. This module makes it easy for the end user to use these \
components. Instead of requiring the user to create a named class with the \
desired roles applied, or apply roles to the instance one-by-one, he can \
just create a new class from yours with 'with_traits', and then instantiate \
that. \
 \
There is also 'new_with_traits', which exists for compatibility reasons. It \
accepts a 'traits' parameter, creates a new class with those traits, and \
then instantiates it. \
 \
   Class->new_with_traits( traits => [qw/Foo Bar/], foo => 42, bar => 1 ) \
 \
returns exactly the same object as \
 \
   Class->with_traits(qw/Foo Bar/)->new( foo => 42, bar => 1 ) \
 \
would. But you can also store the result of 'with_traits', and call other \
methods: \
 \
   my $c = Class->with_traits(qw/Foo Bar/); \
   $c->new( foo => 42 ); \
   $c->whatever( foo => 1234 ); \
 \
And so on."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.13"

RPM_NAME = "perl-MooseX-Traits-0.13-1.24.noarch.rpm"
RPM_HASH = "e1a0e11d0ff794e3ec50cc889faf72370abab35b27aff69c9587de526b3467ff1e33f88bae1a65be4c37bf8046dd7b49c11b8df4a635ee7d97e52f1c86992d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Traits \
perl-MooseX--Traits--Util \
perl-MooseX-Traits"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Load \
perl-Moose--Role \
perl-Sub--Exporter \
perl-namespace--autoclean"

inherit rpm

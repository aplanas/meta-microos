SUMMARY = "Teach ->new to accept single, non-hashref arguments"
DESCRIPTION = "MooseX::OneArgNew lets your constructor take a single argument, which will \
be translated into the value for a one-entry hashref. It is a parameterized \
role|MooseX::Role::Parameterized with three parameters: \
 \
* type \
 \
The Moose type that the single argument must be for the one-arg form to \
work. This should be an existing type, and may be either a string type or a \
MooseX::Type. \
 \
* init_arg \
 \
This is the string that will be used as the key for the hashref constructed \
from the one-arg call to new. \
 \
* coerce \
 \
If true, a single argument to new will be coerced into the expected type if \
possible. Keep in mind that if there are no coercions for the type, this \
will be an error, and that if a coercion from HashRef exists, you might be \
getting yourself into a weird situation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-MooseX-OneArgNew-0.007-1.4.noarch.rpm"
RPM_HASH = "8a273ea3701732c7b0129560eb4cdf0725d793153933775371889cb6c4b85755d86206543150e05ea85d296612c0b5b99a69700feba3ad6871265eee56c39c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--OneArgNew \
perl-MooseX-OneArgNew"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Role--Parameterized \
perl-namespace--autoclean"

inherit rpm

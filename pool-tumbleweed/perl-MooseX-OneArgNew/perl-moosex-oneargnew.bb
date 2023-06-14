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

RPM_NAME = "perl-MooseX-OneArgNew-0.007-1.2.noarch.rpm"
RPM_HASH = "07233eb4e6507f7a27041ed0209892ee9a0995c6c520b0859b73c40dd9e026035646d1872a99e38df636ea88b336aab245c575ba7bb4a48aebd227521cf4fb9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--OneArgNew \
perl-MooseX-OneArgNew"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Role--Parameterized \
perl-namespace--autoclean"

inherit rpm

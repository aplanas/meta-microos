SUMMARY = "UNIVERAL::moniker"
DESCRIPTION = "Class names in Perl often don't sound great when spoken, or look good when \
written in prose. For this reason, we tend to say things like 'customer' or \
'basket' when we are referring to 'My::Site::User::Customer' or \
'My::Site::Shop::Basket'. We thought it would be nice if our classes knew \
what we would prefer to call them. \
 \
This module will add a 'moniker' (and 'plural_moniker') method to \
'UNIVERSAL', and so to every class or module."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-UNIVERSAL-moniker-0.08-13.28.noarch.rpm"
RPM_HASH = "dacaf92ee7712b92b015403286d10ab730f370885ebe0a296fda44c6b7cf5c5e9e9191238e1ce21822052ca5450c1e7124aa53051df2d41972550f8ca292c268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL \
perl-UNIVERSAL--moniker \
perl-UNIVERSAL-moniker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

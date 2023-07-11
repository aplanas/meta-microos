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

RPM_NAME = "perl-UNIVERSAL-moniker-0.08-13.27.noarch.rpm"
RPM_HASH = "cd93b181c813703d6242f96f76d9caf7b2740913c65133b2b3dd98f69de2d5ffb60063d71548d30d292cea3ef8556ea936de5cd0be4a51f75806adc4c08f78ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL \
perl-UNIVERSAL--moniker \
perl-UNIVERSAL-moniker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

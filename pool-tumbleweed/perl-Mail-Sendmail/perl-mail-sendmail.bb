SUMMARY = "Simple platform independent mailer"
DESCRIPTION = "Simple platform independent e-mail from your perl script. Only requires \
Perl 5 and a network connection. \
 \
Mail::Sendmail takes a hash with the message to send and sends it to your \
mail server. It is intended to be very easy to setup and use. See also \
'FEATURES' below, and as usual, read this documentation. \
 \
There is also a FAQ (see 'NOTES')."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.80"

RPM_NAME = "perl-Mail-Sendmail-0.80-1.21.noarch.rpm"
RPM_HASH = "d9c001ccbda38ccf148a5bf4b2728e342f16bcd3aaf1a0573ce27a6b133e06cad3f4d9fca34316fc38a566df47a8f41e5de3636327be40ad92ba28cd3364644f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sendmail \
perl-Mail-Sendmail"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-parent"

inherit rpm

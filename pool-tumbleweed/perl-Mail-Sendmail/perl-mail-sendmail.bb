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

RPM_NAME = "perl-Mail-Sendmail-0.80-1.22.noarch.rpm"
RPM_HASH = "b8e51d8d5af702a3f5b31ce064ad484b7363910f7f0810eaa9b1119e3c0a22945d406e47844940a7701fefbefeaa07a2a95d2c99cc8e9d1d8b0212698771432f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sendmail \
perl-Mail-Sendmail"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm

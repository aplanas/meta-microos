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

RPM_NAME = "perl-Mail-Sendmail-0.80-1.23.noarch.rpm"
RPM_HASH = "5e510a7060b1554c77f5d29213a2a75ec6f838ee4b71d5eb10bdfeea0e87e7e8d4d802bfed17477cc1cd10a3728efe7e1b10cadd113ce0655c8eb396a01a95d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sendmail \
perl-Mail-Sendmail"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm

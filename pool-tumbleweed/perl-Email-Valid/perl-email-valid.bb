SUMMARY = "Check validity of Internet email addresses"
DESCRIPTION = "This module determines whether an email address is well-formed, and \
optionally, whether a mail host exists for the domain. \
 \
Please note that there is no way to determine whether an address is \
deliverable without attempting delivery (for details, see at \
http://perldoc.perl.org/perlfaq9.html#How-do-I-check-a-valid-mail-address)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.203"

RPM_NAME = "perl-Email-Valid-1.203-1.2.noarch.rpm"
RPM_HASH = "55c55d6375afc381f234fbb50ef34e931b17f5784ccccfbb02397a9c5a873edbc7bf302af87cc296ddf88e5fd125d0c80e8f5ebd78e5c9545912b008e96192d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::Valid) \
perl-Email-Valid"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::CaptureOutput) \
perl(Mail::Address) \
perl(Net::DNS) \
perl(Net::Domain::TLD)"

inherit rpm

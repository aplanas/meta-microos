SUMMARY = "Check validity of Internet email addresses"
DESCRIPTION = "This module determines whether an email address is well-formed, and \
optionally, whether a mail host exists for the domain. \
 \
Please note that there is no way to determine whether an address is \
deliverable without attempting delivery (for details, see at \
http://perldoc.perl.org/perlfaq9.html#How-do-I-check-a-valid-mail-address)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.203"

RPM_NAME = "perl-Email-Valid-1.203-1.4.noarch.rpm"
RPM_HASH = "f6d767b0a6e885837e7539bc7d83e4d07337760f51a83cc15a2e37a8e8c014976b32593adefd588d8d1980dce804168fd2f31c32488c26a61aa5c3892ccbde41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Valid \
perl-Email-Valid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--CaptureOutput \
perl-Mail--Address \
perl-Net--DNS \
perl-Net--Domain--TLD"

inherit rpm

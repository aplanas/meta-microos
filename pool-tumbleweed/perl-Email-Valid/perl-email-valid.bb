SUMMARY = "Check validity of Internet email addresses"
DESCRIPTION = "This module determines whether an email address is well-formed, and \
optionally, whether a mail host exists for the domain. \
 \
Please note that there is no way to determine whether an address is \
deliverable without attempting delivery (for details, see at \
http://perldoc.perl.org/perlfaq9.html#How-do-I-check-a-valid-mail-address)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.203"

RPM_NAME = "perl-Email-Valid-1.203-1.3.noarch.rpm"
RPM_HASH = "beb25ceddc30516c367de4adcad35fcfc24a7cde5dc2b3f59e99d07ad61d569f15273aef2de949a0270456e5c5f1ce9be8167237eb1d4257c4e914c9037a42e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Valid \
perl-Email-Valid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--CaptureOutput \
perl-Mail--Address \
perl-Net--DNS \
perl-Net--Domain--TLD"

inherit rpm

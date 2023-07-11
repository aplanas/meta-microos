SUMMARY = "Companion module for Readonly.pm, to speed up read-only scalar variables"
DESCRIPTION = "This is a companion module to Readonly.pm.  You do not use \
Readonly::XS directly.  Instead, once it is installed, Readonly.pm \
will detect this and will use it for creating read-only scalars.  This \
results in a significant speed improvement.  This does not speed up \
read-only arrays or hashes. \
 \
Authors: \
-------- \
    Eric Roode, <roode@cpan.org>"
LICENSE = "GPL-2.0+"

PV = "1.05"

RPM_NAME = "perl-Readonly-XS-1.05-23.38.aarch64.rpm"
RPM_HASH = "e61510e5a741a3bc0d3c2aec4ba1ea984b503fd30c5b30bbc787733c001058cda4e8b6b53b9da2d47a9cba32b2516ab99927cab0e0fd0c35b1bbe03eb1f773b0"

RPROVIDES:${PN} += "Readonly-XS \
perl-Readonly--XS \
perl-Readonly-XS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Readonly"

inherit rpm

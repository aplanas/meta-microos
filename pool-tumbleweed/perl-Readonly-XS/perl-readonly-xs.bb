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

RPM_NAME = "perl-Readonly-XS-1.05-23.39.aarch64.rpm"
RPM_HASH = "9e8d0f1203a33430011ac3b48f7c0f7f87f174fec5926df199bec6c68a80a2380da310b5109353ab8cd16973139bcd91f1d7332826068a4455f47857516a8232"

RPROVIDES:${PN} += "Readonly-XS \
perl-Readonly--XS \
perl-Readonly-XS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Readonly"

inherit rpm

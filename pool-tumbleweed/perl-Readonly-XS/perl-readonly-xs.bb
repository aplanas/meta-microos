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

RPM_NAME = "perl-Readonly-XS-1.05-23.37.aarch64.rpm"
RPM_HASH = "2f03b0dd389f2297a8ca4c74fedef81f59b280c2cc551c00ee75d8dae2171854fe88e394de3ddc5fac0d0ea883aa9230c5457a8a40bc7f53b34e6be4d06bc87f"

RPROVIDES:${PN} += "Readonly-XS \
perl(Readonly::XS) \
perl-Readonly-XS \
perl-Readonly-XS(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Readonly)"

inherit rpm

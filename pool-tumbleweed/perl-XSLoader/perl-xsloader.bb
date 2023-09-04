SUMMARY = "Dynamically load C libraries into Perl code"
DESCRIPTION = "This module defines a standard _simplified_ interface to the dynamic \
linking mechanisms available on many platforms. Its primary purpose is to \
implement cheap automatic dynamic loading of Perl modules. \
 \
For a more complicated interface, see DynaLoader. Many (most) features of \
'DynaLoader' are not implemented in 'XSLoader', like for example the \
'dl_load_flags', not honored by 'XSLoader'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-XSLoader-0.24-1.28.aarch64.rpm"
RPM_HASH = "7142587baebc41ba8ae7e6c53e48aa2e9035460c55b3694ea67fe4b39dade3447403f6637a820adb27666e07a10d9292fb954641b7f91982b180358c057b6d00"

RPROVIDES:${PN} += "perl-DynaLoader \
perl-XSLoader"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

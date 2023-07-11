SUMMARY = "Walk Perl syntax tree, printing debug info about ops"
DESCRIPTION = "See _ext/B/README_ and the newer B::Concise."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-B-Debug-1.26-1.17.noarch.rpm"
RPM_HASH = "6ab317cd32b01ab5d147d706f659c231285b66e4fec9255d91c4b1eadf28abaa2145b8035f4e4717991b4bed43974521e373c9e49e2d455284f00d07948ff4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Debug \
perl-B-Debug"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-deprecate"

inherit rpm

SUMMARY = "Walk Perl syntax tree, printing debug info about ops"
DESCRIPTION = "See _ext/B/README_ and the newer B::Concise."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-B-Debug-1.26-1.18.noarch.rpm"
RPM_HASH = "1e40cb7950341c2ae127e3c806f47ac6a23d1a290cda877bb8afcee906a9f42b14fef65576a99367dbe746bac136b5b8cf91430c74fad9a302ea1911937e4cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Debug \
perl-B-Debug"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-deprecate"

inherit rpm

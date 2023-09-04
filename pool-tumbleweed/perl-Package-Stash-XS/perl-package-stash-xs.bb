SUMMARY = "Faster and more correct implementation of the Package::Stash API"
DESCRIPTION = "This is a backend for Package::Stash, which provides the functionality in a \
way that's less buggy and much faster. It will be used by default if it's \
installed, and should be preferred in all environments with a compiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.30"

RPM_NAME = "perl-Package-Stash-XS-0.30-1.6.aarch64.rpm"
RPM_HASH = "9d573bf23fe70bccc1eca0d3cb1e068fdecce659b97945d49e972d86d808ed04696b2af5b4c8202e7af96b8d6a1355d2efc7f0752e0332ead7d7dfa2b222b171"

RPROVIDES:${PN} += "perl-Package--Stash--XS \
perl-Package-Stash-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

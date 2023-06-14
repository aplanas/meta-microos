SUMMARY = "Faster and more correct implementation of the Package::Stash API"
DESCRIPTION = "This is a backend for Package::Stash, which provides the functionality in a \
way that's less buggy and much faster. It will be used by default if it's \
installed, and should be preferred in all environments with a compiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.30"

RPM_NAME = "perl-Package-Stash-XS-0.30-1.4.aarch64.rpm"
RPM_HASH = "aa7c9d70af19dd3c001a6e7a29996828232b16a098cdbb41e5b49a78ed9e80170baa89f5df5c82ab9e8904c611a740565d656a9e2c080142fcaa7a191f0b298c"

RPROVIDES:${PN} += "perl-Package--Stash--XS \
perl-Package-Stash-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm

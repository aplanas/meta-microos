SUMMARY = "Faster and more correct implementation of the Package::Stash API"
DESCRIPTION = "This is a backend for Package::Stash, which provides the functionality in a \
way that's less buggy and much faster. It will be used by default if it's \
installed, and should be preferred in all environments with a compiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.30"

RPM_NAME = "perl-Package-Stash-XS-0.30-1.5.aarch64.rpm"
RPM_HASH = "2fa3c25a02670431457bd70656bfab04eebd6b422d4e80d93c86f995c49c4782242694d6c8089a9a9aa2dfe6466e676c0144375c7d169267ed220e083f066433"

RPROVIDES:${PN} += "perl-Package--Stash--XS \
perl-Package-Stash-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

SUMMARY = "Test fallback behaviour in absence of modules"
DESCRIPTION = "This module allows you to deliberately hide modules from a program even \
though they are installed. This is mostly useful for testing modules that \
have a fallback when a certain dependency module is not installed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Test-Without-Module-0.21-1.3.noarch.rpm"
RPM_HASH = "edd3b9cf95957909b8bf55b3afd867bc52c0bd4f82f67817474fb2a52ad532316b48b0502ca4e454dc8936fec7f2db7c92c9686e7fa826af2b544953296eb15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Without--Module \
perl-Test-Without-Module"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

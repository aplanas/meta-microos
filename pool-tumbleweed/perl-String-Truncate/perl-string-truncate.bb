SUMMARY = "Module for when strings are too long to be displayed in.."
DESCRIPTION = "a module for when strings are too long to be displayed in..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.100603"

RPM_NAME = "perl-String-Truncate-1.100603-1.3.noarch.rpm"
RPM_HASH = "0778f7d83418d4c6d3f4c292e1bfdd300ea61b8440c3588a245163e1bc3429b5bc7fe914b011f3ec9e77c546e765fe975f38b3eec8911cec7d1300d910b3dfdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Truncate \
perl-String-Truncate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub--Install"

inherit rpm

SUMMARY = "Moose in a box"
DESCRIPTION = "This Task installs Moose and then optionally installs a number of Moose \
extensions listed below. This list is meant to be comprehensive, so if I \
missed something please let me know."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Task-Moose-0.03-10.20.noarch.rpm"
RPM_HASH = "c2577fd9cad2539631a3283a8c0ee5326680c5ed634a1b20ad1c080694a5bc832b96890aa1eb127c05e90d2cd3b7dfe808d24102c6ff0865abd571c1d5b48016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Moose \
perl-Task-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm

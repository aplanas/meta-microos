SUMMARY = "A perlish implementation of Java like inner classes"
DESCRIPTION = "Yet another implementation of an anonymous class with per object \
overrideable methods, but with the added attraction of sort of working \
dispatch to the parent class's method."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.200001"

RPM_NAME = "perl-Class-Inner-0.200001-13.28.noarch.rpm"
RPM_HASH = "7685b159c41b170b34fedcd194ba21d2f70ba8895fe4aac508b406747afe018382b08ae2fb9b49e61e09bad37274335b0670f1e4d6e386a64a7daec6d0f35c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inner \
perl-Class-Inner"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

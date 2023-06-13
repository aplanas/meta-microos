SUMMARY = "Perl module to generate random data"
DESCRIPTION = "A module used to generate random data. Useful mostly for test programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Data-Random-0.13-1.17.noarch.rpm"
RPM_HASH = "019487aa1cd4072d06dca39120d87be0ae0869c9b286cf5a09c7d08b5242bd203ecb09445e8cce53b60249c403a8a7184249f2461c0500e31a73912d1de34ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Random) \
perl(Data::Random::WordList) \
perl-Data-Random"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Time::Piece)"

inherit rpm

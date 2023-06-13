SUMMARY = "Micro Objects. Mo is less"
DESCRIPTION = "Micro Objects. Mo is less."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.40"

RPM_NAME = "perl-Mo-0.40-1.24.noarch.rpm"
RPM_HASH = "f92aadf323090544c271e032253100f2c73315d0061d193262f2e052ac0b762e84f45e1d7b1791ff219f213b38934b72ec45100844240bb7c8e1990b19275fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mo) \
perl(Mo::Golf) \
perl(Mo::Inline) \
perl(Mo::Moose) \
perl(Mo::Mouse) \
perl(Mo::build) \
perl(Mo::builder) \
perl(Mo::chain) \
perl(Mo::coerce) \
perl(Mo::default) \
perl(Mo::exporter) \
perl(Mo::import) \
perl(Mo::importer) \
perl(Mo::is) \
perl(Mo::nonlazy) \
perl(Mo::option) \
perl(Mo::required) \
perl(Mo::xs) \
perl-Mo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

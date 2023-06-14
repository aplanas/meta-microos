SUMMARY = "Perl extension for rounding numbers"
DESCRIPTION = "*Math::Round* supplies functions that will round numbers in different ways. \
The functions *round* and *nearest* are exported by default; others are \
available as described below. 'use ... qw(:all)' exports all functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.07"

RPM_NAME = "perl-Math-Round-0.07-1.26.noarch.rpm"
RPM_HASH = "22e345b2f432d3dae574f62b041393eabf519fc5c74a1e5673861c3552c17c1a76c8fa8150d1e653ea49d320e64f909281b0ce8ddd94cd562c4eba225668fa8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Round \
perl-Math-Round"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-AutoLoader"

inherit rpm

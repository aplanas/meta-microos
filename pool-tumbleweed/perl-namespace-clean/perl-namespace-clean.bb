SUMMARY = "Keep imports and functions out of your namespace"
DESCRIPTION = "Keep imports and functions out of your namespace"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-namespace-clean-0.27-1.26.noarch.rpm"
RPM_HASH = "333467e6bb570c7245a7d2e384857a2018706240c948c5fc1b42292f0f7b62ab0b1ca5b9238c3917a80eabcd75bbc26ca3ce3d2f901611788081f029e732e953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-namespace--clean \
perl-namespace-clean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Hooks--EndOfScope \
perl-Package--Stash"

inherit rpm

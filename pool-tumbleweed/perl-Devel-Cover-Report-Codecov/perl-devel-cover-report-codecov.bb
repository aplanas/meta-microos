SUMMARY = "Backend for Codecov reporting of coverage statistics"
DESCRIPTION = "Devel::Cover::Report::Codecov is coverage reporter for at \
https://codecov.io."
LICENSE = "MIT"

PV = "0.25"

RPM_NAME = "perl-Devel-Cover-Report-Codecov-0.25-1.17.noarch.rpm"
RPM_HASH = "a5aa6cba68e1bcb35fbc752d01110b8e0fa23d47c05a4ed96783c2373bcd977c3e66fc8c00849d01373693969e8e8495df0b7a48f80dca5d6ef08fea2c51da32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cover--Report--Codecov \
perl-Devel--Cover--Report--Codecov--Service--AppVeyor \
perl-Devel--Cover--Report--Codecov--Service--Bitrise \
perl-Devel--Cover--Report--Codecov--Service--Circle \
perl-Devel--Cover--Report--Codecov--Service--Codeship \
perl-Devel--Cover--Report--Codecov--Service--Drone \
perl-Devel--Cover--Report--Codecov--Service--Git \
perl-Devel--Cover--Report--Codecov--Service--GitLab \
perl-Devel--Cover--Report--Codecov--Service--Mercurial \
perl-Devel--Cover--Report--Codecov--Service--Semaphore \
perl-Devel--Cover--Report--Codecov--Service--Shippable \
perl-Devel--Cover--Report--Codecov--Service--Travis \
perl-Devel--Cover--Report--Codecov--Service--Wercker \
perl-Devel-Cover-Report-Codecov"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-Devel--Cover \
perl-Furl \
perl-IO--Socket--SSL \
perl-JSON--XS \
perl-Module--Find \
perl-Sub--Retry \
perl-URI"

inherit rpm

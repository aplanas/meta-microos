SUMMARY = "Backend for Codecov reporting of coverage statistics"
DESCRIPTION = "Devel::Cover::Report::Codecov is coverage reporter for at \
https://codecov.io."
LICENSE = "MIT"

PV = "0.25"

RPM_NAME = "perl-Devel-Cover-Report-Codecov-0.25-1.16.noarch.rpm"
RPM_HASH = "c840e3f01f90ab36fc30c15ee8c92ec8faa7cc53c4fe00f29eebb521a196947734f9bbefe51f5e68a8b299f418eee1d9652a8a0219c1fb8c9ab61217fd607e85"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-Devel--Cover \
perl-Furl \
perl-IO--Socket--SSL \
perl-JSON--XS \
perl-Module--Find \
perl-Sub--Retry \
perl-URI"

inherit rpm

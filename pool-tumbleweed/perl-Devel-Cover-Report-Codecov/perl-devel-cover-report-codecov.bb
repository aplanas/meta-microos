SUMMARY = "Backend for Codecov reporting of coverage statistics"
DESCRIPTION = "Devel::Cover::Report::Codecov is coverage reporter for at \
https://codecov.io."
LICENSE = "MIT"

PV = "0.25"

RPM_NAME = "perl-Devel-Cover-Report-Codecov-0.25-1.15.noarch.rpm"
RPM_HASH = "b590325a3177b8d733fb93538fd810c27eaea8165d39031125d546fe3f97c054549eba6d431230118a587b6a33dcd722e233f5a2d5734fe22b4b2f4bc3e9433a"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Capture--Tiny \
perl-Devel--Cover \
perl-Furl \
perl-IO--Socket--SSL \
perl-JSON--XS \
perl-Module--Find \
perl-Sub--Retry \
perl-URI"

inherit rpm

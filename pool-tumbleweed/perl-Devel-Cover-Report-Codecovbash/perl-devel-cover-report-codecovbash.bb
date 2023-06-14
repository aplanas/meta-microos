SUMMARY = "Generate a JSON file to be uploaded with the codecov bash script"
DESCRIPTION = "This is a coverage reporter for Codecov. It generates a JSON file that can \
be uploaded with the bash script provided by codecov. See \
https://docs.codecov.io/docs/about-the-codecov-bash-uploader for details. \
 \
The generated file will be named _codecov.json_ and will be in the \
_cover_db_ directory by default. \
 \
Nearly all of the code in this distribution was simply copied from Pine \
Mizune's at https://metacpan.org/release/Devel-Cover-Report-Codecov \
distribution."
LICENSE = "MIT"

PV = "0.04"

RPM_NAME = "perl-Devel-Cover-Report-Codecovbash-0.04-1.9.noarch.rpm"
RPM_HASH = "51c88f936cce48fd98bdfaab5321f41c0c31c936ef1e4453c537f108227664d826105d07ef1b70ddbfa0c59261630ae65e8cca0bc060decb0e17cf3a0c62131a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cover--Report--Codecovbash \
perl-Devel-Cover-Report-Codecovbash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-JSON--MaybeXS \
perl-namespace--autoclean"

inherit rpm

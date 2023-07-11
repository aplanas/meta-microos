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

RPM_NAME = "perl-Devel-Cover-Report-Codecovbash-0.04-1.10.noarch.rpm"
RPM_HASH = "4d3904635217ab12f622959a80942ad490eb1a9251ff841025dc758f19962ba199fd39d806c1568fd6eb79cea4e9337375340a083c6961f213a331ccc92993cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cover--Report--Codecovbash \
perl-Devel-Cover-Report-Codecovbash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-JSON--MaybeXS \
perl-namespace--autoclean"

inherit rpm

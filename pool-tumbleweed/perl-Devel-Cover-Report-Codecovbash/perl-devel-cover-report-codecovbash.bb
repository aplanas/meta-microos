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

RPM_NAME = "perl-Devel-Cover-Report-Codecovbash-0.04-1.11.noarch.rpm"
RPM_HASH = "fcbab7d230681e76b8cf80fd5d0f456795be4eca609fcda294c71f3129238956beb8bafafc39006b03a885a54f8f46775995816918ed417fe32f798839193648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cover--Report--Codecovbash \
perl-Devel-Cover-Report-Codecovbash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-JSON--MaybeXS \
perl-namespace--autoclean"

inherit rpm

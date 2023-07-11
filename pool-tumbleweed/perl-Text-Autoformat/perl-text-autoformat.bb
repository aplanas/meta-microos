SUMMARY = "Automatic text wrapping and reformatting"
DESCRIPTION = "Automatic text wrapping and reformatting"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-Text-Autoformat-1.75-1.16.noarch.rpm"
RPM_HASH = "1e602104d8148b22b94e6ec2f0afee5067276889ba0d94b4d483bc8b8bbf357f663cb429242f5ceaff7fc3854ee94bb7137541ea35e5ed9e6e54cab60abf6b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Autoformat \
perl-Text--Autoformat--Hang \
perl-Text--Autoformat--NullHang \
perl-Text-Autoformat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Text--Reform"

inherit rpm

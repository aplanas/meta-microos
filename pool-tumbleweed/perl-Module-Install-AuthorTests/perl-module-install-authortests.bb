SUMMARY = "Designate Tests Only Run by Module Authors"
DESCRIPTION = "designate tests only run by module authors"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Module-Install-AuthorTests-0.002-1.29.noarch.rpm"
RPM_HASH = "edf7384c7e61aaa80c9d90ce47f34532974b1b16e8ce5bccacb0a1a3f07688f11f0f9dd5bb6d580228ecc0dab1cfc98b4717db3e114c8c38604ae6227ce9be35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--AuthorTests \
perl-Module-Install-AuthorTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Install"

inherit rpm

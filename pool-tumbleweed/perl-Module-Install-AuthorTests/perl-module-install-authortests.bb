SUMMARY = "Designate Tests Only Run by Module Authors"
DESCRIPTION = "designate tests only run by module authors"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Module-Install-AuthorTests-0.002-1.27.noarch.rpm"
RPM_HASH = "a7ebfa4da4efc516fc18aa7670db61fe360099073bf896c1925c64d2234147ab74c8dfaba68c7fe004a0e9deef71236fe7620c38a26e11b44669b6d8153fd4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--AuthorTests \
perl-Module-Install-AuthorTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Module--Install"

inherit rpm

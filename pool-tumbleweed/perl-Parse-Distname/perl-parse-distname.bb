SUMMARY = "Parse a distribution name"
DESCRIPTION = "Parse::Distname is yet another distribution name parser. It works almost \
the same as CPAN::DistnameInfo, but Parse::Distname takes a different \
approach. It tries to extract a version part of a distribution and treat \
the rest as a distribution name, contrary to CPAN::DistnameInfo which tries \
to define a name part and treat the rest as a version. \
 \
Because of this difference, when Parse::Distname parses a weird \
distribution name such as 'AUTHOR/v1.0.tar.gz', it says the name is empty \
and the version is 'v1.0', while CPAN::DistnameInfo says the name is 'v' \
and the version is '1.0'. See test files in this distribution if you need \
more details. As of this writing, Parse::Distname returns a different \
result for about 200+ distributions among about 320000 BackPan \
distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.05"

RPM_NAME = "perl-Parse-Distname-0.05-1.3.noarch.rpm"
RPM_HASH = "ec4846e67d552a917b934e0a5fa9faf60b411e1ea828c56c6b298d94fd5d2d9cf62cb0806c72c2c29ed9647b053e8a7a0dcf5fb4c9a2b3cf9583b074474ef5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--Distname \
perl-Parse-Distname"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

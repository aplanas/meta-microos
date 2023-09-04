SUMMARY = "Compile .po files to .mo files"
DESCRIPTION = "Compile .po files to .mo files"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Locale-Msgfmt-0.15-8.23.noarch.rpm"
RPM_HASH = "864c0b0e5c0f4810a3a00eb980e1e5bd98de55138f27d2157aab86db67863b3711d66321d5f77566d1da24a760c5282fe02c1b8e5a130a12b574212a8604cf42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Msgfmt \
perl-Locale--Msgfmt--Utils \
perl-Locale--Msgfmt--mo \
perl-Locale--Msgfmt--po \
perl-Locale-Msgfmt \
perl-Module--Install--Msgfmt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

SUMMARY = "Charset Information for MIME"
DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.013.1"

RPM_NAME = "perl-MIME-Charset-1.013.1-1.3.noarch.rpm"
RPM_HASH = "31055a82fc3c4fb14f798b8ab0d08dde92108c4662aa133ada50dc913324f8d9058d462e57bf274d2525bcfa4d4fe9ff2168239f6977bd288f28ad34dd56cc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Charset \
perl-MIME--Charset---Compat \
perl-MIME--Charset--UTF \
perl-MIME-Charset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

SUMMARY = "Colorizes text using ANSI colors"
DESCRIPTION = "colorizes text using ANSI colors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0.3"

RPM_NAME = "perl-Template-Plugin-Filter-ANSIColor-0.0.3-1.12.noarch.rpm"
RPM_HASH = "3f456b87abd9d48c2ad1d11c5b7d460dda2d8fc6860076c66c2588cbca1c013c7d0e2cc7508998d4da17ee7b74be38041f7f4036920712fea52a1310da021a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--Filter--ANSIColor \
perl-Template-Plugin-Filter-ANSIColor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Template \
perl-Term--ANSIColor \
perl-Term--Terminfo"

inherit rpm

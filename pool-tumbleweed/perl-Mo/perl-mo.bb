SUMMARY = "Micro Objects. Mo is less"
DESCRIPTION = "Micro Objects. Mo is less."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.40"

RPM_NAME = "perl-Mo-0.40-1.26.noarch.rpm"
RPM_HASH = "9eebcd03bcc2c11f9fbe752f0cae420f951f50a812c3722b830b0335c98351b947922a65cb39f241133ade41097bc600f3639b45f162c3bfade955636197a687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mo \
perl-Mo--Golf \
perl-Mo--Inline \
perl-Mo--Moose \
perl-Mo--Mouse \
perl-Mo--build \
perl-Mo--builder \
perl-Mo--chain \
perl-Mo--coerce \
perl-Mo--default \
perl-Mo--exporter \
perl-Mo--import \
perl-Mo--importer \
perl-Mo--is \
perl-Mo--nonlazy \
perl-Mo--option \
perl-Mo--required \
perl-Mo--xs"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

SUMMARY = "Micro Objects. Mo is less"
DESCRIPTION = "Micro Objects. Mo is less."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.40"

RPM_NAME = "perl-Mo-0.40-1.25.noarch.rpm"
RPM_HASH = "050192821425bef19859e25c0dd0af5a9efc2a9f87daba72f17299f3685f13a62f433fe126540d972e9a5abf521284538ff3b85c25f0c35a68ec542727b3062c"
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
perl--MODULE-COMPAT-5.36.1"

inherit rpm

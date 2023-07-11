SUMMARY = "Another way of exporting symbols"
DESCRIPTION = "This module serves as an easy, clean alternative to Exporter. Unlike \
Exporter, it is not subclassed, but it simply exports a custom import() \
into your namespace. \
 \
With Exporter::Tidy, you don't need to use any package global in your \
module. Even the subs you export can be lexically scoped."
LICENSE = "SUSE-Public-Domain"

PV = "0.08"

RPM_NAME = "perl-Exporter-Tidy-0.08-1.27.noarch.rpm"
RPM_HASH = "377abfc86a1724cb1a08ddebf3d1f0033e1cd84481cc2b6bf51bf0318a3d632afc7e8a8d938fd526e0901173bc62c08af71732437bd508d06efadba2f4fd1e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Tidy \
perl-Exporter-Tidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

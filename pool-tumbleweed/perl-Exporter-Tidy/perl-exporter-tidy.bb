SUMMARY = "Another way of exporting symbols"
DESCRIPTION = "This module serves as an easy, clean alternative to Exporter. Unlike \
Exporter, it is not subclassed, but it simply exports a custom import() \
into your namespace. \
 \
With Exporter::Tidy, you don't need to use any package global in your \
module. Even the subs you export can be lexically scoped."
LICENSE = "SUSE-Public-Domain"

PV = "0.08"

RPM_NAME = "perl-Exporter-Tidy-0.08-1.28.noarch.rpm"
RPM_HASH = "28ac4f58bb47fa184a621ee1ba76a8d65118ae82ab8af052dcf83d43afb9fbe6f50e3b86891b709e2bd66eb134b5b80e0b9be79f9debec7f51dae50e31879350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Tidy \
perl-Exporter-Tidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

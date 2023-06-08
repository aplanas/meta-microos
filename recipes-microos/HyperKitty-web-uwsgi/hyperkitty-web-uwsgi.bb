SUMMARY = "HyperKitty - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.5"

RPM_NAME = "HyperKitty-web-uwsgi-1.3.5-7.1.noarch.rpm"
RPM_HASH = "84a1264856a607936f37de67f09b5c9128b6504f88ae435d190c6c7ecc3ec2785514311af46e2bac16d0fff0a086e7fb0d7d5cd3ed436981963728ca2595ea4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web-uwsgi config(HyperKitty-web-uwsgi)"
RDEPENDS:${PN} += "HyperKitty-web python39-uwsgi-python3"

inherit rpm

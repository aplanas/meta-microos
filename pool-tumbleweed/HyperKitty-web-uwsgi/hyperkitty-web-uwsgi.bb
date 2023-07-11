SUMMARY = "HyperKitty - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "HyperKitty-web-uwsgi-1.3.7-1.1.noarch.rpm"
RPM_HASH = "5eedfa57b1daa49c9240ff64fe360a9937a1ac7d091300605473abae18a4db30e352b19d03ed4eb9ffbaf56ce602426a7fb91a6017f470f376cd24e32c82fc1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web-uwsgi \
config-HyperKitty-web-uwsgi"

RDEPENDS:${PN} += "HyperKitty-web \
python39-uwsgi-python3"

inherit rpm

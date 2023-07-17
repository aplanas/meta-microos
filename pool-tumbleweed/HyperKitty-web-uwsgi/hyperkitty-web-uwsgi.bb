SUMMARY = "HyperKitty - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "HyperKitty-web-uwsgi-1.3.7-2.1.noarch.rpm"
RPM_HASH = "0908be7b21a90547e513d5f52fcd1661af2e6ab6d54f32a5276ded0473a983b89e96a9ae9a8271c171a150bee6fbbdc4caa979647a18a188c055b780e23c8f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web-uwsgi \
config-HyperKitty-web-uwsgi"

RDEPENDS:${PN} += "HyperKitty-web \
python311-uwsgi-python3"

inherit rpm

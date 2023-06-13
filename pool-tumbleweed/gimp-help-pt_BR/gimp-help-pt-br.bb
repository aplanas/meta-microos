SUMMARY = "Brazilian Portuguese Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Brazilian Portuguese data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-pt_BR-2.10.0-2.5.noarch.rpm"
RPM_HASH = "ddc5d95e193081d5c66152a0141ceff39f1cf9042149af217b6969665dcbc8b051c5a168869016f440b50ff26c931eb55aab7f515ada2964ab2b49021bb8dda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-pt_BR \
locale(gimp-help:pt_BR)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

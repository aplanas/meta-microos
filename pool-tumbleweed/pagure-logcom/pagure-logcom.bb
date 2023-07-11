SUMMARY = "The logcom service for pagure"
DESCRIPTION = "pagure-logcom contains the service that logs commits into the database so that \
the activity calendar heatmap is filled."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-logcom-5.13.3-1.5.noarch.rpm"
RPM_HASH = "787219ee2651ca2f8d698dc0d7a0cd7325568c073fa18e9a408159815e684d7b264ae585f1b5bc19fc7acc07677509ae4f180d1c75c243b209b30425ff30cdc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-logcom"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm

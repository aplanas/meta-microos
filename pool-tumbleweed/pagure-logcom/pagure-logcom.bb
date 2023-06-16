SUMMARY = "The logcom service for pagure"
DESCRIPTION = "pagure-logcom contains the service that logs commits into the database so that \
the activity calendar heatmap is filled."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-logcom-5.13.3-1.4.noarch.rpm"
RPM_HASH = "0ad5d21b875b094d2cd314ba2fd70eb47164c4e92289371e142ed5b71ca77d40655a601c4923e8d8f309000fdf6fc7c4bbe8b57cd87bf89ace2660632ee5357d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-logcom"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm

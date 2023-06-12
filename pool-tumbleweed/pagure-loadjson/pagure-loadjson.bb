SUMMARY = "The loadjson service for pagure"
DESCRIPTION = "pagure-loadjson is the service allowing to update the database with the \
information provided in the JSON blobs that are stored in the tickets (and \
in the future pull-requests) git repo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-loadjson-5.13.3-1.4.noarch.rpm"
RPM_HASH = "f4463308e25271283bbfd3923604ca98232e5e878a29727ba4277e8df991111777f169d83ff6f47b41625bf2b3b5dba5bd8a33a368c81f81672c84604b958109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-loadjson"
RDEPENDS:${PN} += "/bin/sh \
pagure \
systemd"

inherit rpm

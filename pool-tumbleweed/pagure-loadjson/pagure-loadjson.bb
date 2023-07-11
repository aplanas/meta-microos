SUMMARY = "The loadjson service for pagure"
DESCRIPTION = "pagure-loadjson is the service allowing to update the database with the \
information provided in the JSON blobs that are stored in the tickets (and \
in the future pull-requests) git repo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-loadjson-5.13.3-1.5.noarch.rpm"
RPM_HASH = "f292d7db56620f3e1d3bc2125c467dca5fd2f3e4fa3a60252fa8074b37726c603baf10994fb16410aa81a276c57632f90f52f9d9a58789bc3a4e604d29102a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-loadjson"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm

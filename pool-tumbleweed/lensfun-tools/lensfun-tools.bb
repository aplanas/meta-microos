SUMMARY = "Tools for managing lensfun data"
DESCRIPTION = "This package contains tools to fetch lens database updates and manage lens \
adapters in lensfun."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-tools-0.3.3-1.7.aarch64.rpm"
RPM_HASH = "de8898f05f728f61753250b5981266ead5dfdfce684810bb39af678ea01de3571fb7de29a8ba70ca45d8f9eaf4b39e41e23fa06dfad87aca07d98a9fcceb4d57"

RPROVIDES:${PN} += "lensfun-tools \
lensfun-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
lensfun-data \
python3-lensfun"

inherit rpm

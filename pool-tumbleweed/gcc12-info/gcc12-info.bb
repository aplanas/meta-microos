SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-info-12.3.0+git1204-1.1.noarch.rpm"
RPM_HASH = "4988122931f1f2641c1dbee154ae1da51895f40fadb2ae7c4a95bdbf659f9c4e3a46cd90500104009935c05ddda41b8ab1f7869977c24d6dbc9b9d928be17ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc12-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

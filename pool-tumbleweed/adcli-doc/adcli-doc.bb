SUMMARY = "Documentation for adcli"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain. \
 \
This package contains the documentation for adcli."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "adcli-doc-0.9.2-1.4.noarch.rpm"
RPM_HASH = "bb4e083989ffe67dc48c0aa04a6943b9fe893890513de7425cee48950940437a98c180bdb4671c5c2d235c9a611adb7172421ba65b78b5cd7593b9e645b2cd6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adcli-doc"

RDEPENDS:${PN} += ""

inherit rpm

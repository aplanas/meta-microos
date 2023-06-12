SUMMARY = "Development files for filezilla"
DESCRIPTION = "This are development files for filezilla."
LICENSE = "GPL-2.0-or-later"

PV = "3.64.0"

RPM_NAME = "filezilla-devel-3.64.0-1.1.aarch64.rpm"
RPM_HASH = "c370867f0477b95da1a445333dfd3864bc89a653d1420ea7c90f6ce7ad0e6bbdd249737b9c06df78d77e7537ae57bc238e454c99886157170834202e4538b5ee"

RPROVIDES:${PN} += "filezilla-devel filezilla-devel(aarch-64)"
RDEPENDS:${PN} += "filezilla"

inherit rpm

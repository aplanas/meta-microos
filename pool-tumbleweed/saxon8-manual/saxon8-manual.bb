SUMMARY = "Manual for saxon8"
DESCRIPTION = "Manual for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-manual-B.8.8-133.7.noarch.rpm"
RPM_HASH = "6c2602516f27d2103b87ed8da34d5ad5a907d1607d518bbfd51270c5837588ecf430482b2c39a54de1637a84d6bc04cae9e0feae278e7f53b7abc2fef166fd7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-manual"

RDEPENDS:${PN} += ""

inherit rpm

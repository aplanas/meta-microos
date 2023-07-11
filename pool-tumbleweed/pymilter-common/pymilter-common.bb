SUMMARY = "Common files for pymilter"
DESCRIPTION = "This package contains the common files used for pymilter."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "pymilter-common-1.0.4-3.14.noarch.rpm"
RPM_HASH = "507790f7593a1a62a81434d30789e99fc2be26c632a5744f68cbde49ad9b14413644951687d466b37c4a2af4f4ef185bfcdc26a581ac80cb01c2a496015ef490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pymilter-common"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm

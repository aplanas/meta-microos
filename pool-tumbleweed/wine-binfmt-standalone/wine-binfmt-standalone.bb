SUMMARY = "Standalone binfmt_misc support for Windows"
DESCRIPTION = "Standalone variant for running Windows(tm) executables out of the box. \
This package does not depend on systemd and dbus, which may not be \
available on obs workers for example."
LICENSE = "GPL-2.0"

PV = "1.2.1"

RPM_NAME = "wine-binfmt-standalone-1.2.1-1.3.noarch.rpm"
RPM_HASH = "0ce5462bb2f676565d09c3a94661d88474e42364e40c24512a55c1f59b087449af24682ddacc546d046917bc4016383d806ab52d4e657126e4d07e699665a69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-binfmt-standalone"

RDEPENDS:${PN} += "/usr/bin/sh \
wine-binfmt"

inherit rpm

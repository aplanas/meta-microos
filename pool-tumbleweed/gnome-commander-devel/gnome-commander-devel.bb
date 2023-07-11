SUMMARY = "Development files for gnome-commander"
DESCRIPTION = "Development files for gnome-commander."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.0"

RPM_NAME = "gnome-commander-devel-1.16.0-2.4.aarch64.rpm"
RPM_HASH = "a6dc82af0fc898797a1f364d06c7832d838f400a68a701791c000adc008ec686b5efef70f7614cbcff3e57e87746a7f3041f138ceac8dac5698f3c0add1b3ee1"

RPROVIDES:${PN} += "gnome-commander-devel"

RDEPENDS:${PN} += ""

inherit rpm

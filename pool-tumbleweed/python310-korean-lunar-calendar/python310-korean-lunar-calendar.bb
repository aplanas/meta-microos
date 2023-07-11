SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-korean-lunar-calendar-0.3.1-1.4.noarch.rpm"
RPM_HASH = "fcad6c011b4697c7ed476eebec59523dd7460f9907940fd0b7809a9eeca623a8cae3cf27aa0cdeb3b5034cbf811e5dcfc50920196ff5d815e054e2c0ea3f0976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-korean-lunar-calendar \
python310-korean-lunar-calendar \
python3dist-korean-lunar-calendar"

RDEPENDS:${PN} += "python-abi"

inherit rpm

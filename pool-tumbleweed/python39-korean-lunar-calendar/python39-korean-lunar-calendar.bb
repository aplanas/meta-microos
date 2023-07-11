SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-korean-lunar-calendar-0.3.1-1.4.noarch.rpm"
RPM_HASH = "625ecfd5f5531829fb414b1262d6d622b8665e4600067bb57eb67788d7ec16da38c794ab604dde95b5549f66629c63353536967459c83e16aeb58c4d68ee862f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-korean-lunar-calendar \
python39-korean-lunar-calendar \
python3dist-korean-lunar-calendar"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-korean-lunar-calendar-0.3.1-1.3.noarch.rpm"
RPM_HASH = "953f920d8dfe38543a14710162687f068bb73a92ee2b0fe442c64e0d242994de60a67ecefc757d96f8e33492418d9e62ddeb36cbdce837136f13f72ea34cb999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(korean-lunar-calendar) \
python39-korean-lunar-calendar \
python39-korean_lunar_calendar \
python3dist(korean-lunar-calendar)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

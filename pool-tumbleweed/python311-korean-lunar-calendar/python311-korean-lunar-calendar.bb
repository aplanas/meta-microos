SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-korean-lunar-calendar-0.3.1-1.4.noarch.rpm"
RPM_HASH = "faca6cbcfc59eedf1b9f2538e4daa36edd641a5275bb91c2addcf0e7d4178bdb81d6bdd560a448748dd51413f62ebd15c5888905bcb35aa035268973c374a7a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-korean-lunar-calendar \
python3.11dist-korean-lunar-calendar \
python311-korean-lunar-calendar \
python3dist-korean-lunar-calendar"

RDEPENDS:${PN} += "python-abi"

inherit rpm

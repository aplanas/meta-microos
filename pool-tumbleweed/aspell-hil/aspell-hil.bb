SUMMARY = "Hiligaynon Dictionary for Aspell"
DESCRIPTION = "A Hiligaynon dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.11"

RPM_NAME = "aspell-hil-0.11-2.14.aarch64.rpm"
RPM_HASH = "d548f1b43a7e35e8726ad130c7fee7a5f80ef4fcded0e649dbbafd21e5267aa4bfde3b725b878fc51eca6ae2648011ee942188760719d0ce272d0020ba55ebb8"

RPROVIDES:${PN} += "aspell-hil \
locale-aspell-hil"

RDEPENDS:${PN} += ""

inherit rpm

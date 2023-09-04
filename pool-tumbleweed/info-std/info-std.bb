SUMMARY = "The info pages of the Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-std-7.0.3-1.4.noarch.rpm"
RPM_HASH = "5f33028c412edf26080794c7fbf7d8168821beed1949dde073a5b886f537509ca5d481b6fe9a82cc250ab5af7a3cffba1d7113f54fb49ef90653a82fa7a392af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-std"

RDEPENDS:${PN} += ""

inherit rpm

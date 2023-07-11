SUMMARY = "On-screen Keyboard for GNOME -- Common data files"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-common-0.4.21-8.8.aarch64.rpm"
RPM_HASH = "ce63323249d22977b79c055b4a5e58bb9f3830323a9c31b3f24ab5c72d29851bb89fab479476bb92482afa7b0539c264a6c1df935c4b9e67e85d838c248da443"

RPROVIDES:${PN} += "caribou-common"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Shells.com command line interface"
DESCRIPTION = "Command line tool for interacting with the Shells.com backend system."
LICENSE = "MIT"

PV = "0~20210507"

RPM_NAME = "shells-cli-0~20210507-1.11.aarch64.rpm"
RPM_HASH = "41c1ba7d7bbaf62d1241f0ca8ea719b2d83ad125dc19a1fe038a337faf12f774d47d7879f3adb79c8130ca21a68a003cd23b324b76e0ee1af71e95b4de444abb"

RPROVIDES:${PN} += "shells-cli"

RDEPENDS:${PN} += ""

inherit rpm

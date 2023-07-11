SUMMARY = "Arch-independent data files for the Lugaru game"
DESCRIPTION = "This package contains arch-independent data files for the game Lugaru."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "1.2"

RPM_NAME = "lugaru-data-1.2-2.23.noarch.rpm"
RPM_HASH = "404cfe3842924b8f26dba5bbb4ca4e284d4719b03613b4828a3a1dbc05eaf211b0d29635adae2367d4f710ce2927a604888927000d7b8dde34a52e02e46eebf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lugaru-data"

RDEPENDS:${PN} += "lugaru"

inherit rpm

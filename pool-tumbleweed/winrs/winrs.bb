SUMMARY = "Windows Remote Shell"
DESCRIPTION = "This is a command line tool for the Windows Remote Shell protocol. \
It can be used to send shell commands to remote Windows hosts."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "winrs-2.7.2-2.8.noarch.rpm"
RPM_HASH = "88824b4a5858e32c335dafd9e8f859294c9939dfe1d8fe807bc1885b63649af937b78552f911357e6c7fb60cd1a117884270be04d30808972c10354af854fddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "winrs"

RDEPENDS:${PN} += "/usr/bin/ruby \
openwsman-ruby"

inherit rpm

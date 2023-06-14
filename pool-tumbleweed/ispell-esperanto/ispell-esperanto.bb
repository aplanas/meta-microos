SUMMARY = "Esperanto ispell dictionary"
DESCRIPTION = "This package includes a ready Esperanto dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-esperanto-1.5-422.6.aarch64.rpm"
RPM_HASH = "13cb4b19dcea9b8893aeeaac158763c3a876687936a1660584cb503431adf6a0fc367c788fc09c2d120373d5bb72a5a3e54ccdd3fc24a3ae58c30b06d0406b34"

RPROVIDES:${PN} += "iesperan \
ispell-dictionary \
ispell-esperanto"

RDEPENDS:${PN} += ""

inherit rpm

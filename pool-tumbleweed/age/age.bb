SUMMARY = "A file encryption tool"
DESCRIPTION = "Age features small explicit keys, no config options, and UNIX-style \
composability."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "age-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "33ea66ad17d87669d6ca7fd49879650881360b242ec62cf531aa2130f7c9df5afc2711a23ce20758538368ddaaca35c9872f2a6784442fa48b14024e93fd6a9e"

RPROVIDES:${PN} += "age"

RDEPENDS:${PN} += ""

inherit rpm

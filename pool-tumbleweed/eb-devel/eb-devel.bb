SUMMARY = "EB Header Files and Libraries"
DESCRIPTION = "EB header files and libraries."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "eb-devel-4.4.3-3.28.aarch64.rpm"
RPM_HASH = "eb717411b8e484df8ed325051a5becab9df98291d87752cb17f9aa9a1ac24371290add59e25b4d759bf99e40af70c98f77bf99cae8d704305de49867274d8d38"

RPROVIDES:${PN} += "eb-devel \
eb-devel(aarch-64) \
ebdev"
RDEPENDS:${PN} += "eb"

inherit rpm

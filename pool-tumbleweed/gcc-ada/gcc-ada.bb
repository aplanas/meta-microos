SUMMARY = "The system GNU Ada Compiler"
DESCRIPTION = "The system GNU Ada Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-ada-13-1.3.aarch64.rpm"
RPM_HASH = "b4368d2a2ead48a2588a0c2163268172b8fd1182165cb1482255125be86ce9ef3caf5bba59c1942e3514cecbf12e1d0f5e68f41229c5c8712b4e5456cc27e26c"

RPROVIDES:${PN} += "gcc-ada"

RDEPENDS:${PN} += "gcc \
gcc13-ada"

inherit rpm

SUMMARY = "The system GNU Ada Compiler"
DESCRIPTION = "The system GNU Ada Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-ada-13-1.5.aarch64.rpm"
RPM_HASH = "63387ca363b4fbf2db738bcd60a14d78e94cab1d09a991a59afac1d3062093c6696641a11ce5daa068d609bb320dd48e32e6177d24fb9800411259f9ee8a29f2"

RPROVIDES:${PN} += "gcc-ada"

RDEPENDS:${PN} += "gcc \
gcc13-ada"

inherit rpm

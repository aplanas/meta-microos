SUMMARY = "Binary files of pax"
DESCRIPTION = "Binary files of pax"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10843"

RPM_NAME = "texlive-pax-bin-2023.20230311.svn10843-91.1.aarch64.rpm"
RPM_HASH = "9b6588f59b587b41a0e36c2c05ee4649cbe9ec67258d7f8aa80dd2f66f1e3131a036a86a5a2e9ba5c934e98471ef3d5a0933ef81334ffa35687f908a37c2313c"

RPROVIDES:${PN} += "texlive-pax-bin \
texlive-pax-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-pax"

inherit rpm

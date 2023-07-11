SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0"

RPM_NAME = "python39-adblock-0.6.0-2.4.aarch64.rpm"
RPM_HASH = "a3782077a6c2f3edfce7cb16ceaaa6444a2d079844a40797dda12c2f41bba512f268130f03edcdb20b69f67756b47affcc2635d0795fc52983fec5b082027aba"

RPROVIDES:${PN} += "python3.9dist-adblock \
python39-adblock \
python3dist-adblock"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm

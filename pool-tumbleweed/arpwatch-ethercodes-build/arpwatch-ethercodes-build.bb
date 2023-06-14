SUMMARY = "Tool to create ethercodes.dat from IEEE.org meta data"
DESCRIPTION = "Tool and required files to create the ethercodes.dat file from the OUI \
and company ID data as provided by IEEE.org.  This package is only \
needed if you want to build the arpwatch-ethercodes package."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "arpwatch-ethercodes-build-3.3-2.2.aarch64.rpm"
RPM_HASH = "64a6449ec31b7487594ec112e88ee044a4c0bdaefb94acaf732746a3ef64392e69af247b58e092db5f8fa9a083f32de936bd5d7871dee9d1d9d96664552b7744"

RPROVIDES:${PN} += "arpwatch-ethercodes-build"

RDEPENDS:${PN} += ""

inherit rpm

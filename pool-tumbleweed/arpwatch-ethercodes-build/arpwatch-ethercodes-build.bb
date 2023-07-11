SUMMARY = "Tool to create ethercodes.dat from IEEE.org meta data"
DESCRIPTION = "Tool and required files to create the ethercodes.dat file from the OUI \
and company ID data as provided by IEEE.org.  This package is only \
needed if you want to build the arpwatch-ethercodes package."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "arpwatch-ethercodes-build-3.3-2.3.aarch64.rpm"
RPM_HASH = "43d519996d396a3550fc3d787ca8e70f868abb5b8d18144736120313814add5bf411f09b1b55741871e6c91adcd896fd698a6402dda535cf5864459ac44ebd41"

RPROVIDES:${PN} += "arpwatch-ethercodes-build"

RDEPENDS:${PN} += ""

inherit rpm

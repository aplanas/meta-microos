SUMMARY = "Header files for the 5250 Emulator"
DESCRIPTION = "Header files for use with the tn5250 library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "tn5250-devel-0.16.5-469.7.aarch64.rpm"
RPM_HASH = "7965c902d23a505b55591029b8dccd8277517acc3da01136d7a70aae9ec0eb1d5720815906532c7de252cdd4f29a2b1855871747c18e58f25425a9c94799c7b7"

RPROVIDES:${PN} += "tn5250-/usr/include/tn5250/tn5250d.h \
tn5250-devel"

RDEPENDS:${PN} += "lib5250-0"

inherit rpm

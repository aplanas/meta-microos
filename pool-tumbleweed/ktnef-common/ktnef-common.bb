SUMMARY = "Files requires by libKPim5Tnef5"
DESCRIPTION = "Files that can't be in the libKPim5Tnef5 package anymore."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktnef-common-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7f1579a7607e27872b0b0da7d83476aba1afbf561a7b0a71733279ddded5570ac55860593bd699a6425daded8b0ba91aa415ead2d60f32606d6e36bcda4af036"

RPROVIDES:${PN} += "ktnef-common"

RDEPENDS:${PN} += ""

inherit rpm

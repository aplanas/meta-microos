SUMMARY = "Development files for GnuCash"
DESCRIPTION = "This package provides all the necessary files for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "gnucash-devel-4.14-1.4.aarch64.rpm"
RPM_HASH = "05adb62a045301160e92ac68c8834056ed0dfaca5bba67cb515c8999281ac249d1a82b1e5a5e1d8b20b6a2fd415a0e016df133481e81eb90fec01595e1f55c29"

RPROVIDES:${PN} += "gnucash-devel"

RDEPENDS:${PN} += "gnucash"

inherit rpm

SUMMARY = "Development files for GnuCash"
DESCRIPTION = "This package provides all the necessary files for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "5.3"

RPM_NAME = "gnucash-devel-5.3-1.1.aarch64.rpm"
RPM_HASH = "de78bc4579c8a63fb78065b7f1add4513bf71d6be2d29557060187cda91f25ae40254b0e2b58e2d959b1cd670a1017fbd71248c93c0945b00502a1dca93da935"

RPROVIDES:${PN} += "gnucash-devel"

RDEPENDS:${PN} += "gnucash"

inherit rpm

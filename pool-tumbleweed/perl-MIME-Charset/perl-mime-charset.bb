SUMMARY = "Charset Information for MIME"
DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.013.1"

RPM_NAME = "perl-MIME-Charset-1.013.1-1.4.noarch.rpm"
RPM_HASH = "a9d7ca3b61d6b4ce6a44fc6e300f5f8152bb01bd37fd69443adf0b1c63103bad89ce6903dca41f14d1378356fdaf525d43c013900d8b775e36855a2c6d785858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Charset \
perl-MIME--Charset---Compat \
perl-MIME--Charset--UTF \
perl-MIME-Charset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

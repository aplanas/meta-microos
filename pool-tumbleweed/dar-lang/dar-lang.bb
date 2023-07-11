SUMMARY = "Translations for package dar"
DESCRIPTION = "Provides translations for the 'dar' package."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.9"

RPM_NAME = "dar-lang-2.7.9-1.1.noarch.rpm"
RPM_HASH = "f7f821e64f68905aa5c21cb90de88a9ef73927d9b83b283b215084aaf580de7bb73b8dcf36ce0184ee31ae274c6ae429bd2bb20a153582b423146d731b1c5892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dar-lang \
dar-lang-all \
locale-dar-fr \
locale-dar-sv"

RDEPENDS:${PN} += "dar"

inherit rpm

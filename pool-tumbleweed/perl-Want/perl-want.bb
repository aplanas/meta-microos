SUMMARY = "Generalisation of C<Wantarray>"
DESCRIPTION = "This module generalises the mechanism of the *wantarray* function, allowing \
a function to determine in some detail how its return value is going to be \
immediately used."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.29"

RPM_NAME = "perl-Want-0.29-1.35.aarch64.rpm"
RPM_HASH = "7740aa1fb60d45c91a9dbf6bef5386c3b88e96f68e21759dffd8a18c36a9454ded59b586a876068550555c7b908a53cf0df2993c38ea3ed8cd0d9c5b78da08a0"

RPROVIDES:${PN} += "perl-Want"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

SUMMARY = "Test and example scripts for connman"
DESCRIPTION = "Provides test and example scripts for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-test-1.41-4.8.aarch64.rpm"
RPM_HASH = "d45d0ad9592512e7a763315c61880799956180f45798f4794eb61237e8f261b03b27e43cecbd87e4112998ed83af47c7f6271acb7379c672539032be0f60d4b2"

RPROVIDES:${PN} += "connman-test"

RDEPENDS:${PN} += "/usr/bin/python \
connman"

inherit rpm

SUMMARY = "Main Samba administration tool"
DESCRIPTION = "The package contains samba-tool, the main tool for Samba Administration."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-tool-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "5683b9448123d97a14c3fb181cdce86b5467d2cefb707624e3e080ab2743b8aa706cdbe147faba03e5bc22fe97c6c1ad47ad08d696664e8f4756edb780c44367"

RPROVIDES:${PN} += "samba-tool"

RDEPENDS:${PN} += "/usr/bin/python3 \
samba \
samba-ldb-ldap \
samba-python3"

inherit rpm

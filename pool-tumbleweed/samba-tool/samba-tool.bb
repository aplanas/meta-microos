SUMMARY = "Main Samba administration tool"
DESCRIPTION = "The package contains samba-tool, the main tool for Samba Administration."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-tool-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "5a2ac065b70e0b28edc6f416c3bf3468cb2e7cf30216c254e0e17c96aaedd85b2ac1572c03e1632d56268942891c4b9757ab987ca6f1b779f2b2416659ea8946"

RPROVIDES:${PN} += "samba-tool"

RDEPENDS:${PN} += "/usr/bin/python3 \
samba \
samba-ldb-ldap \
samba-python3"

inherit rpm

SUMMARY = "XML data files needed by liboath"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. It contains shared libraries, command line \
tools and a PAM module. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238). OATH stands for Open AuTHentication, which is the \
organization that specify the algorithms. For managing secret key \
files, the Portable Symmetric Key Container (PSKC) format described in \
RFC6030 is supported."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "oath-toolkit-xml-2.6.7-3.5.noarch.rpm"
RPM_HASH = "68520a972d9b8f67ab2c5291454b23d9fb48875db352037c14c74c9419d651bc416a88d8d737abd6568b436dcb3f809ca4526b9b52de70091a63e9069680b822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oath-toolkit-xml"
RDEPENDS:${PN} += ""

inherit rpm

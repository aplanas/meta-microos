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

PV = "2.6.8"

RPM_NAME = "oath-toolkit-xml-2.6.8-1.1.noarch.rpm"
RPM_HASH = "a742dd3ea4464f0da696793a81a6ff92f51d572d6327166cfee21584fcd77ddf5d275e83d580debadf0ab0950fb4e0a54e6bc92c192e069f77fb94978071f7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oath-toolkit-xml"

RDEPENDS:${PN} += ""

inherit rpm

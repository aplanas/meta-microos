SUMMARY = "Toolkit for one-time password authentication systems"
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

RPM_NAME = "oath-toolkit-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "856e03a832bf432de00282c0902f5a09c699f9eb698f4028c6283870bbb5a0193ce64da18ee2d9e55c7c8a2775734fcc8c1e85bd75d71c6f7f18252cb584dc82"

RPROVIDES:${PN} += "oath-toolkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboath.so.0 \
libpskc.so.0"

inherit rpm

SUMMARY = "Mail User Agent"
DESCRIPTION = "Alpine is a display-oriented email client that is suitable for both \
the inexperienced email user as well as for the most demanding of \
power users. Alpine is based on the Pine® Message System, which was \
also developed at the University of Washington. Alpine can be learned \
by exploration and the use of context-sensitive help. The user \
experience is highly customizable through the use of the Alpine Setup \
command."
LICENSE = "Apache-2.0"

PV = "2.26"

RPM_NAME = "alpine-2.26-27.4.aarch64.rpm"
RPM_HASH = "2fe1d6763f67fe089fe43560f5970ba44070ff00336389b745417247960c6db410f0af763ee80c11d11d19a6cf7dcc5849513108765e9ee281936b682c443521"

RPROVIDES:${PN} += "alpine \
pine \
pine4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libssl.so.3 \
libtinfo.so.6"

inherit rpm

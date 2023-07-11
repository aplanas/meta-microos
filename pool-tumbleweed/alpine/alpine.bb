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

RPM_NAME = "alpine-2.26-27.5.aarch64.rpm"
RPM_HASH = "8fc7d26cddbd736667ff0000d32e0e116e3a2d1d7ab97bf2437d5fdf08ab435c54c35948732c6b0fea1cb05bc327356496876ccedafbf66b91aed407523c643e"

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

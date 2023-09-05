SUMMARY = "An IMAP and POP3 Server for Maildir MTAs"
DESCRIPTION = "Courier-IMAP is a fast, scalable, enterprise IMAP server that uses \
Maildirs. Many E-mail service providers use Courier-IMAP to easy handle \
hundreds of thousands of mail accounts. With its built-in IMAP and POP3 \
aggregation proxy, Courier-IMAP has practically infinite horizontal \
scalability. In a proxy configuration, a pool of Courier servers service \
initial IMAP and POP3 connections from clients. They wait to receive the \
client's log in request, look up the server that actually holds this mail \
account's mailbox, and establish a proxy connection to the server, all in \
a single, seamless process. Mail accounts can be moved between different \
servers, to achieve optimum resource usage. \
 \
The only practical limitation on Courier-IMAP is available network and I/O \
bandwidth. If you are new to Courier-IMAP, this may sound a bit \
intimidating. But you do not need to tackle everything at once. Start by \
taking small, easy steps. Your first step will be to set up a small \
Courier-IMAP server, using it like any other traditional IMAP service, on \
a single server. After you gain experience and become comfortable with \
Courier, you can then begin exploring its advanced features. \
 \
This is the same IMAP server that's included in the Courier mail server, \
but configured as a standalone IMAP server that can be used with other \
mail servers - such as Qmail, Exim, or Postfix - that deliver to maildirs. \
If you already have Courier installed, you do not need to download this \
version. If you install this version, you must remove it if you later \
install the entire Courier server."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.5"

RPM_NAME = "courier-imap-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "7e36678b4e74cf2d24685ba580e94bcb18e794c7ee5b3dd9590d25e6fad0def0af8762951d3484d188c94c950124d9ac9f881c8fbc5b9b388c6022ebd70e68f1"

RPROVIDES:${PN} += "config-courier-imap \
courier-imap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
courier-authlib \
gdbm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourier-unicode.so.7 \
libcourierauth.so.0 \
libcourierauthsasl.so.0 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgdbm.so.6 \
libidn2.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
openssl \
systemd"

inherit rpm

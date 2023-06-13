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

PV = "5.2.4"

RPM_NAME = "courier-imap-5.2.4-1.1.aarch64.rpm"
RPM_HASH = "08117c2e3f50c5bc3ba70c33c9f2beb30b388c1c95b65bf599b1b7df5b64e106f6492a3b3c897cbaba4c9c98eecc5bb62cc58162cabb6eeb00f7b171537109c1"

RPROVIDES:${PN} += "config(courier-imap) \
courier-imap \
courier-imap(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
courier-authlib \
gdbm \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcourier-unicode.so.7()(64bit) \
libcourierauth.so.0()(64bit) \
libcourierauthsasl.so.0()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdbm.so.6()(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit) \
libpcre2-8.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
openssl \
systemd"

inherit rpm

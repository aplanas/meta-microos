SUMMARY = "A reliable logging library"
DESCRIPTION = "librelp is an easy to use library for the RELP protocol. RELP in turn provides \
reliable event logging over the network (and consequently RELP stands for \
Reliable Event Logging Protocol). RELP was initiated by Rainer Gerhards after \
he was finally upset by the lossy nature of plain tcp syslog and wanted a cure \
for all these dangling issues. \
 \
RELP (and hence) librelp assures that no message is lost, not even when \
connections break and a peer becomes unavailable. The current version of RELP \
has a minimal window of opportunity for message duplication after a session has \
been broken due to network problems. In this case, a few messages may be \
duplicated (a problem that also exists with plain tcp syslog). Future versions \
of RELP will address this shortcoming. \
 \
Please note that RELP is a general-purpose, extensible logging protocol. Even \
though it was designed to solve the urgent need of rsyslog-to-rsyslog \
communication, RELP supports many more applications. Extensible command verbs \
provide ample opportunity to extend the protocol without affecting existing \
applications."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.0"

RPM_NAME = "librelp0-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "ffca30ca1f8f590ff481069c1b1b5a89939c671e353ea7f0e10b2df46010a5129d19504ae011129f29e99f9166f50924c247ab1f22f0778c0d8555ec19d740f2"

RPROVIDES:${PN} += "librelp.so.0()(64bit) \
librelp0 \
librelp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm

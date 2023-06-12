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

RPM_NAME = "librelp-devel-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "d1e7001804f468afe7f5be8390b1ff4eb40b72bb8aaebb12e18655e319dd88184efa9335ff7d2f1ebb5c639ac81f54a036a517acd449caa83363f5dc01491ae3"

RPROVIDES:${PN} += "librelp-devel \
librelp-devel(aarch-64) \
pkgconfig(relp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-devel \
librelp0 \
pkgconfig(openssl)"

inherit rpm

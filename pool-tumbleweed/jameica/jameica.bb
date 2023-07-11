SUMMARY = "Runtime environment for Java applications like Hibiscus"
DESCRIPTION = "Serves as a base framework for recurring tasks on Hibiscus. \
Keeps a unified look & feel. Strictly separate program and \
user data. Supports synchronous and asynchronous data exchange \
via between plugins (via messaging) and allows client server \
communication via RMI, XML-RPC and SOAP. Comes with headless \
mode (no GUI for servers) and logging."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.4"

RPM_NAME = "jameica-2.10.4-1.2.noarch.rpm"
RPM_HASH = "240af051bdd66c4bab3c6750aac458bc980482375639b3b23ca332dd84cf4325b88eb6c0365830561880a488c09febaa8b3e5f73465b08ab29ce52c341cb09b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica"

RDEPENDS:${PN} += "/usr/bin/sh \
java \
nanoxml \
paperclips \
swtcalendar \
velocity"

inherit rpm

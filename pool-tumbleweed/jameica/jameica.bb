SUMMARY = "Runtime environment for Java applications like Hibiscus"
DESCRIPTION = "Serves as a base framework for recurring tasks on Hibiscus. \
Keeps a unified look & feel. Strictly separate program and \
user data. Supports synchronous and asynchronous data exchange \
via between plugins (via messaging) and allows client server \
communication via RMI, XML-RPC and SOAP. Comes with headless \
mode (no GUI for servers) and logging."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.4"

RPM_NAME = "jameica-2.10.4-1.1.noarch.rpm"
RPM_HASH = "a46fd87543160b39acf3e5822d3efeffaf3322c28e7d0f63df04dbc84cffccaccf5c69529bcfcd106d4ac3d7eaced5d7789b0666575244571339ddaeff657dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica"

RDEPENDS:${PN} += "/bin/sh \
java \
nanoxml \
paperclips \
swtcalendar \
velocity"

inherit rpm

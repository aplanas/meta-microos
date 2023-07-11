SUMMARY = "Cisco-like telnet command-line library"
DESCRIPTION = "libcli provides a shared library for including a Cisco-like command-line \
interface into other software. It's a telnet interface which supports \
command-line editing, history, authentication and callbacks for a \
user-definable function tree."
LICENSE = "LGPL-2.1-only"

PV = "1.10.7+git.20211009"

RPM_NAME = "libcli-devel-1.10.7+git.20211009-1.6.aarch64.rpm"
RPM_HASH = "aac521cb632ebfe2c74ccda5d5329ac5814b6878a98d30848ba2651948569298c2b81bed6a8cc64033494bfab030a115b813f7a3464b1f26cf23c3eb7b30f175"

RPROVIDES:${PN} += "libcli-devel"

RDEPENDS:${PN} += "libcli1-10"

inherit rpm

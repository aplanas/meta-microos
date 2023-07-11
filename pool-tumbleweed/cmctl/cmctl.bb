SUMMARY = "CLI tool that can help you to manage cert-manager resources inside your cluster"
DESCRIPTION = "cmctl is a CLI tool that can help you to manage cert-manager resources inside your cluster. \
While also available as a kubectl plugin, it is recommended to use as a stand alone binary as this allows the use of command auto-completion."
LICENSE = "Apache-2.0"

PV = "1.12.2"

RPM_NAME = "cmctl-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "8a08b07eb5f3a6e1406cb990602a3958da39ee78b1af4266baddc2b0a5d7c538ded582eb92d7c56dc3ec751b4f0a226714739af33f328bc6000d4a845c232a32"

RPROVIDES:${PN} += "cmctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

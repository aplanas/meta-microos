SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops CLIs and installing helm charts, with a single command. \
You can also download CLIs like kubectl, kind, kubectx and helm faster than you can type 'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.9.13"

RPM_NAME = "arkade-0.9.13-1.1.aarch64.rpm"
RPM_HASH = "280eb338879bb2758e6fa33ac597cde893d785748fde165e5eeb3cec0059ba3de7e60bb5b2183c5b66a8cbaf5567640c5a6c8263b24a7a0ad893d9b155af78aa"

RPROVIDES:${PN} += "arkade arkade(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

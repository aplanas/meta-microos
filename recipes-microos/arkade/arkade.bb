SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops CLIs and installing helm charts, with a single command. \
You can also download CLIs like kubectl, kind, kubectx and helm faster than you can type 'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.9.17"

RPM_NAME = "arkade-0.9.17-1.1.aarch64.rpm"
RPM_HASH = "606f88182329d6fe7e42132d6f0705cc7462623ce6bbfbb763f8d3290078e820ca8adcdff4524f1bf4f3ac6d6aed74bbed3260d874d8db92b546b7de12e587e6"

RPROVIDES:${PN} += "arkade arkade(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

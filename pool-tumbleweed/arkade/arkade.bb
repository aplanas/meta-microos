SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops CLIs and installing helm charts, with a single command. \
You can also download CLIs like kubectl, kind, kubectx and helm faster than you can type 'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.9.26"

RPM_NAME = "arkade-0.9.26-1.1.aarch64.rpm"
RPM_HASH = "fb6edecf1e92a0f602a6de2847e9dbdac19d4afd79217c4b1b29cd88453b2470ddc5eb352dc2d2cae416382f28e92011c4bb9f548aead7f716054d01773da052"

RPROVIDES:${PN} += "arkade"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

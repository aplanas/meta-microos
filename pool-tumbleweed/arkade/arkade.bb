SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops CLIs and installing helm charts, with a single command. \
You can also download CLIs like kubectl, kind, kubectx and helm faster than you can type 'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "arkade-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "94c548326b143670566a22bcbf4331c7820bf91d61b2577ea3d5f3d55543ed27d8cc73d94156ba6c3683117c01f730609d17069ac71dc7089568e23d381aa61b"

RPROVIDES:${PN} += "arkade"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

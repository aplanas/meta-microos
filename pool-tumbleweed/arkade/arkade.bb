SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops CLIs and installing helm charts, with a single command. \
You can also download CLIs like kubectl, kind, kubectx and helm faster than you can type 'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.9.24"

RPM_NAME = "arkade-0.9.24-1.1.aarch64.rpm"
RPM_HASH = "93d17d1e1551b2c7f0d08c86ea7024065a0ad94f619dae4602d16e14f4dfb7dcdccc278e7c5c2f788576e92b33296be7a02507e8de49d994694b482608a00f7f"

RPROVIDES:${PN} += "arkade"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

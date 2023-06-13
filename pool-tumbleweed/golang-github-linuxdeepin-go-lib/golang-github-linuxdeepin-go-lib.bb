SUMMARY = "Go bindings for Deepin Desktop Environment development"
DESCRIPTION = "DLib is a set of Go bindings/libraries for DDE development. \
Containing dbus (forking from guelfey), glib, gdkpixbuf, pulse and more."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.0"

RPM_NAME = "golang-github-linuxdeepin-go-lib-6.0.0-1.5.noarch.rpm"
RPM_HASH = "aef1fc5aefddba64c8c57f95b7aa3c7db9800666ae21b4e4926469141dee22ed5a3a81e6bfe43c58f8851652a9d24dfd7c676523b1418997ce6ee579295905f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-go-lib"

RDEPENDS:${PN} += "golang(github.com/linuxdeepin/go-gir/gio-2.0) \
golang(github.com/linuxdeepin/go-gir/glib-2.0)"

inherit rpm

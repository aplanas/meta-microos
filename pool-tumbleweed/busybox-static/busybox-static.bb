SUMMARY = "Static linked version of Busybox, a compact UNIX utility collection"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-static-1.36.1-2.1.aarch64.rpm"
RPM_HASH = "502303796c63dc75dba3d96c944c48129e26e70b279f52d54b4056845e10d4d29bce510f80ec5f943eeda3d664003263fed5f6347d806965ed9c31bc8fe2f36d"

RPROVIDES:${PN} += "busybox-static"

RDEPENDS:${PN} += ""

inherit rpm

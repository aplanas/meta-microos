SUMMARY = "Web Phone"
DESCRIPTION = "Devel package for linphone."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.16"

RPM_NAME = "linphone-devel-5.0.16-1.2.noarch.rpm"
RPM_HASH = "43ab298e7aca334c8440c8ab9b098099f75127154a62e2b4d89ee48f5bd0935b2ff627d82c2eb3b75a5cd6525fc1d31ee53e56c13f32ba1aa37931b82f13b94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linphone-devel"

RDEPENDS:${PN} += ""

inherit rpm

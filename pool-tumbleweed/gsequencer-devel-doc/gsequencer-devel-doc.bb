SUMMARY = "Documentation for Advanced Gtk+ Sequencer"
DESCRIPTION = "Advanced Gtk+ Sequencer library development documentation."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "gsequencer-devel-doc-5.2.5-1.1.noarch.rpm"
RPM_HASH = "e38bf12afc1d7413b025a02a861aa14ea4cb0a4e007756a91ba2f095f05cee9a6c05f26a750eb97aeb6da17c1ec7c642900c510a4a9aa6ed7a2ff2a1c3ba9a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsequencer-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm

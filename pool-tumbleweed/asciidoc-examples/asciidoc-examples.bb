SUMMARY = "Examples and Documents for asciidoc"
DESCRIPTION = "This package contains examples and documents of asciidoc."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.0"

RPM_NAME = "asciidoc-examples-10.2.0-1.5.noarch.rpm"
RPM_HASH = "7f62266e3180b474a2480554bbe3669dbff207ccdbe2a5e95f6be6bbf9365aa1ded0d0fc62705c74438c583b8d3d3260a177e479b4bc724dc872f9d2f39c72de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-examples"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Docs for pdnsd"
DESCRIPTION = "This package provides various text files for pdnsd."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.9a"

RPM_NAME = "pdnsd-doc-1.2.9a-10.9.noarch.rpm"
RPM_HASH = "2fb687af328fb179557d44ac8f45f5a3b06d3a4299e6314e768ebdd3d1162025849b01814d4b8b3e4856f9541e7971202daeb784c05289c4c4b0c8e4f6055b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdnsd-doc"

RDEPENDS:${PN} += "pdnsd"

inherit rpm

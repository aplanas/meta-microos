SUMMARY = "Documentation of Audio effects for pipewire applications"
DESCRIPTION = "This package contains documentation of Audio effects for pipewire applications"
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-doc-7.0.3-1.2.noarch.rpm"
RPM_HASH = "4f5a944b000f81c4cc228fcdf897cf1f0c599c3c7ebe9874232e14de552684abb7b4ac3088a6d431c2eead2b82465ff375fd9df135899263c47a2676eead6251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easyeffects-doc"

RDEPENDS:${PN} += ""

inherit rpm

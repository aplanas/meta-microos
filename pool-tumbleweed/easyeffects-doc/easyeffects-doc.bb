SUMMARY = "Documentation of Audio effects for pipewire applications"
DESCRIPTION = "This package contains documentation of Audio effects for pipewire applications"
LICENSE = "GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "easyeffects-doc-7.0.6-1.1.noarch.rpm"
RPM_HASH = "f83c8fb4a730bafe34cd75b0cbe225a5fc92ef90ef968d72875ad0141c8bd5fe1dc132a2ab6082ba792266e4fd9e1ff2de94b7986b156656d3f6c55bfe4f38bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easyeffects-doc"

RDEPENDS:${PN} += ""

inherit rpm

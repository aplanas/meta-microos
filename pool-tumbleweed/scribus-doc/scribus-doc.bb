SUMMARY = "Documentation for Scribus"
DESCRIPTION = "This package provides the documentation for Scribus."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-doc-1.5.8-4.14.aarch64.rpm"
RPM_HASH = "d55e75c2cf95f429683fade8c58af74650469ad9fb0ae3bafa6aef34dc06e89983136006a74785e21eb867aba418f881f4ee27f67b814fb5fb3b7ccfc553a0c3"

RPROVIDES:${PN} += "scribus-doc"

RDEPENDS:${PN} += ""

inherit rpm

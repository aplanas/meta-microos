SUMMARY = "Manx Gaelic (Gaelg) Dictionary for Aspell"
DESCRIPTION = "A Manx Gaelic (Gaelg) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-gv-0.50-2.14.aarch64.rpm"
RPM_HASH = "62c0f7c705600f3d46340f7ba69654447f4b6d2a522ccd0c52175f389bebc1ca9c5fbb2fcaae283d964ed40999f9f24e4bfefc35b02081aedc282520ebdd17f2"

RPROVIDES:${PN} += "aspell-gv \
aspell-gv(aarch-64) \
locale(aspell:gv)"
RDEPENDS:${PN} += ""

inherit rpm

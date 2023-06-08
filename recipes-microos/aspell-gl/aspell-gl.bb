SUMMARY = "Galician Gaelic (galego) Dictionary for Aspell"
DESCRIPTION = "A Galician Gaelic (galego) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-only"

PV = "0.50a"

RPM_NAME = "aspell-gl-0.50a-2.14.aarch64.rpm"
RPM_HASH = "44c54667bd1759871fadf8c336e0881ed966f017e389e902b4b045466674488677a2580d66451888af03a36d54cb4c04fac11b7c2fa2ced64d3624359118879f"

RPROVIDES:${PN} += "aspell-gl aspell-gl(aarch-64) locale(aspell:gl)"
RDEPENDS:${PN} += ""

inherit rpm

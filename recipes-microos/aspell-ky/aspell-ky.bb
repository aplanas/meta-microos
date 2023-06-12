SUMMARY = "Kirghiz (Кыргызча) Dictionary for Aspell"
DESCRIPTION = "A Kirghiz (Кыргызча) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.0"

RPM_NAME = "aspell-ky-0.01.0-2.14.aarch64.rpm"
RPM_HASH = "a35edd9969028f19caa7cd356f6c4087413ed8243a8df0e9b61cc1383e306c93cf36c94e221718320cbd222679af0c690f2160069f44c07d8b3d8d150f03248f"

RPROVIDES:${PN} += "aspell-ky \
aspell-ky(aarch-64) \
locale(aspell:ky)"
RDEPENDS:${PN} += ""

inherit rpm

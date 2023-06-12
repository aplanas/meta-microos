SUMMARY = "Marathi (मराठी) Dictionary for Aspell"
DESCRIPTION = "A Marathi (मराठी) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "aspell-mr-0.10-2.14.aarch64.rpm"
RPM_HASH = "ef290b1ac77016a5dd168a71126c33d4d7da11b64af8793f2abdad6aff10769663ccdb934ed10afd414e4b356ab4a308063facb64ea3f332aca7e888c42c129f"

RPROVIDES:${PN} += "aspell-mr \
aspell-mr(aarch-64) \
locale(aspell:mr)"
RDEPENDS:${PN} += ""

inherit rpm

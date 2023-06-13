SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-translitcodec-0.7.0-1.3.noarch.rpm"
RPM_HASH = "f417818ff2cd372381b710407d14cca9889db24ed1e32e8e4526301d89ccff952a5a23a94e538e769922a4297860363404b935afba9666efa136f8acf735ca2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(translitcodec) \
python311-translitcodec \
python3dist(translitcodec)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

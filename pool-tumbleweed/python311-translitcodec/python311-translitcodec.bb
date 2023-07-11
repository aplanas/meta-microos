SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-translitcodec-0.7.0-1.5.noarch.rpm"
RPM_HASH = "187661afdcd2a8654fab1e67e851d2d5c914797b32ff450cbb2da7143b70c70377a85f37fa0ded29e8ef22cf938f56e8138aed4eaaa56aa7343fb2de81274255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translitcodec \
python3.11dist-translitcodec \
python311-translitcodec \
python3dist-translitcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm

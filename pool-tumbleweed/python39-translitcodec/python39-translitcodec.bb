SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-translitcodec-0.7.0-1.5.noarch.rpm"
RPM_HASH = "25b8775c965a3a3fb59fdbf42e646553fe0c01ebbc9ed597254ae4d6f4470ca76a1ba628d0f4108bf855f92779b812f9494b73a17223ad521c9862a0e9a0ea63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-translitcodec \
python39-translitcodec \
python3dist-translitcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-translitcodec-0.7.0-1.5.noarch.rpm"
RPM_HASH = "2adbc37428ebfebf4542665c8abf6cb5dea114de8838e003bd17d725fa095579cf628a37e7e2b8a5dda4e80d921afd0567dbe25c9e704b9b01e9143b008f77b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-translitcodec \
python310-translitcodec \
python3dist-translitcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm

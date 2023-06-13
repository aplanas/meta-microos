SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-translitcodec-0.7.0-1.3.noarch.rpm"
RPM_HASH = "7f346f56e5e281ad253e07ef1855b9e7e7bdf0a68901ecbc4da078da3c65b096485e027c336bb03237a0d19e73f94990e25151df0ecc8db8b4e461f1f5be11ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translitcodec \
python3.10dist(translitcodec) \
python310-translitcodec \
python3dist(translitcodec)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

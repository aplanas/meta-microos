SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python39-pypandoc-1.11-1.3.noarch.rpm"
RPM_HASH = "e169b829635abf51d47f8ea7c2b7876dca780939f65b0eeca484a3a736edc765562e824d13f2b7a8e13f70116768150eb8c59490cddd1922749883f9030d08fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypandoc \
python39-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "pandoc \
python-abi \
python39-pip \
python39-wheel"

inherit rpm

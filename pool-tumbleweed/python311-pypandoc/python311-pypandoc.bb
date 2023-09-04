SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python311-pypandoc-1.11-1.4.noarch.rpm"
RPM_HASH = "454c4744ff14b3b016a92618d294dba3162d4912f305817c5f7ddd6fa3f9e0fec0b6c7a81d76a97d3aa3ca0c424747746a6bbc68b629dcd89f431809a8036a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypandoc \
python3.11dist-pypandoc \
python311-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "pandoc \
python-abi \
python311-pip \
python311-wheel"

inherit rpm

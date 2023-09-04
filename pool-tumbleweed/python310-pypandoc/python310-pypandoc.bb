SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python310-pypandoc-1.11-1.4.noarch.rpm"
RPM_HASH = "6b6c456dbaec21598756e0c08daf24d6da45321b77f9ebe68361dc4b8ee735d6d65ccd08d80aabdfc5df7a1ae286f9842c954989d3f9d3010fbca045e86a6342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypandoc \
python310-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "pandoc \
python-abi \
python310-pip \
python310-wheel"

inherit rpm

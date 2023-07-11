SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.6+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-only"

PV = "0.12"

RPM_NAME = "python310-docstring-to-markdown-0.12-1.4.noarch.rpm"
RPM_HASH = "be2e4226a429b1ebc4db339204a759f6accce45a6b3625b70c19970f74f9faa832da75032d6774132b2d798d5704b7da04fc5698d253467f13d2a02065f5433f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docstring-to-markdown \
python310-docstring-to-markdown \
python3dist-docstring-to-markdown"

RDEPENDS:${PN} += "python-abi"

inherit rpm

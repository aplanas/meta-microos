SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.6+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-only"

PV = "0.12"

RPM_NAME = "python311-docstring-to-markdown-0.12-1.4.noarch.rpm"
RPM_HASH = "07b0e6345a9842cd9817783178f58d11ca6706410e29a46d61eeeabd94653b79ed20ef100e7ee3777a7bb8d0799214cb6b3b49b2c01558ee3a9c7cbbd31c7c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docstring-to-markdown \
python3.11dist-docstring-to-markdown \
python311-docstring-to-markdown \
python3dist-docstring-to-markdown"

RDEPENDS:${PN} += "python-abi"

inherit rpm

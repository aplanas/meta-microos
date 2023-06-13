SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.6+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-only"

PV = "0.12"

RPM_NAME = "python39-docstring-to-markdown-0.12-1.2.noarch.rpm"
RPM_HASH = "3fc6cd6f2029fd7c036e30fed89a0bc62db164cdedaa228aecc20cb781e9ac00ceea707824f7a8f450c1494ee5e4be0851e7c525471247377186a5cc07baac29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docstring-to-markdown) \
python39-docstring-to-markdown \
python39-docstring_to_markdown \
python3dist(docstring-to-markdown)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

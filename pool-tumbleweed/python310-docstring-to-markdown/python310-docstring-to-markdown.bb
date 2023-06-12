SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.6+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-only"

PV = "0.12"

RPM_NAME = "python310-docstring-to-markdown-0.12-1.2.noarch.rpm"
RPM_HASH = "651bac3218ff0ad2550295b0304f34c79201974f47fb809f3e05a7e3cc23a8724878a99ee5e7c0dd8658d748b192512ba9278bcc786119318ac47fac348673c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docstring-to-markdown \
python3-docstring_to_markdown \
python3.10dist(docstring-to-markdown) \
python310-docstring-to-markdown \
python310-docstring_to_markdown \
python3dist(docstring-to-markdown)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

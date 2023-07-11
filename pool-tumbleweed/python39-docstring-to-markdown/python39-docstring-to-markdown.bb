SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.6+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-only"

PV = "0.12"

RPM_NAME = "python39-docstring-to-markdown-0.12-1.4.noarch.rpm"
RPM_HASH = "b748aa44591e69ec96102c3da3b121cdd425c1315a5bcc2fd6f5962d1a889efdf9c379c1cce0270c3aad9f089ee974cf47eba421bcca55e31139b2b4b45471a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docstring-to-markdown \
python39-docstring-to-markdown \
python3dist-docstring-to-markdown"

RDEPENDS:${PN} += "python-abi"

inherit rpm

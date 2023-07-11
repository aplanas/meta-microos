SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python39-jupyter-ydoc-1.0.2-2.3.noarch.rpm"
RPM_HASH = "ebd68b20fce5519518006fcf0d623336804e21ff7e40e3dfbe789517ff6868774a2db8cc5a02e88ac649692e39ec0ff9b453bb828b0f71dea247065d1fbf097e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-ydoc \
python39-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python39-y-py >= 0.6.0 with python39-y-py < 0.7.0 \
python-abi"

inherit rpm

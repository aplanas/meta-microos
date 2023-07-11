SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python310-jupyter-ydoc-1.0.2-2.3.noarch.rpm"
RPM_HASH = "6c081b1ddc0a7c002bf32562119547cefc1a36e58f4ab07b2790191a44f6b612dd05e031a8fdffeed14cfd61894459767840a7636a942e0d08c96f487021101d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-ydoc \
python310-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python310-y-py >= 0.6.0 with python310-y-py < 0.7.0 \
python-abi"

inherit rpm

SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python311-jupyter-ydoc-0.2.4-1.2.noarch.rpm"
RPM_HASH = "232edebf850ffd0065d56cdeec91742bff5384aaad7d1b55e0592e67ac1b53cf9d8c42a1c584bae654a04b0db339682012795a3bf1783f4b47801460935d39ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-ydoc \
python311-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python311-importlib-metadata >= 3.6 if python311-base < 3.10 \
-python311-y-py >= 0.5.3 with python311-y-py < 0.6.0 \
python-abi"

inherit rpm

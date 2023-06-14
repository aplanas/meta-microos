SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python310-jupyter-ydoc-0.2.4-1.2.noarch.rpm"
RPM_HASH = "bdad17fce79b5f6312b2c1a4507cb21b75615fc1e95ac1b41be7789d0ff9845ac14293cb9dde280ee99d7be87e5e43539c6bd720f14432ea9c78fefbfa91baf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-ydoc \
python3.10dist-jupyter-ydoc \
python310-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python310-y-py >= 0.5.3 with python310-y-py < 0.6.0 \
python-abi"

inherit rpm

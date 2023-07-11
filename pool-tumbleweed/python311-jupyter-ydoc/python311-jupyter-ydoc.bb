SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python311-jupyter-ydoc-1.0.2-2.3.noarch.rpm"
RPM_HASH = "f153473e7503ded70b353aabc21037e7cb0f7dacb4b3000b5e0b8493e3e914ce856b25ea5aba5a5e00d2e85cbc3f72ab6290ded6dcfeba4ea765dec5cef3a7b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-ydoc \
python3.11dist-jupyter-ydoc \
python311-jupyter-ydoc \
python3dist-jupyter-ydoc"

RDEPENDS:${PN} += "-python311-y-py >= 0.6.0 with python311-y-py < 0.7.0 \
python-abi"

inherit rpm

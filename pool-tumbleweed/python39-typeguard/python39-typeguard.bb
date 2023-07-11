SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-typeguard-4.0.0-1.3.noarch.rpm"
RPM_HASH = "619ab1b8d34f88f99eaed406ea29a0d9b59f69504555910f5e4963a4de0d509342aafddb04eec287b9a42c43be68a66ada739035321cd6646f1b23da4c388f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typeguard \
python39-typeguard \
python3dist-typeguard"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-typing-extensions"

inherit rpm

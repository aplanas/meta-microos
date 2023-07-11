SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-typeguard-4.0.0-1.3.noarch.rpm"
RPM_HASH = "9da5b99449cd0b1ad01bfd016c793a99227d53c59ed0d00966a73aa0e9d92a48f7071142506d85499b7546a7ba7fd61982faa44f303f604354ef47d5b0d4690a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typeguard \
python3.11dist-typeguard \
python311-typeguard \
python3dist-typeguard"

RDEPENDS:${PN} += "python-abi \
python311-importlib-metadata \
python311-typing-extensions"

inherit rpm

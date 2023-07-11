SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python39-flufl.i18n-4.1.1-3.3.noarch.rpm"
RPM_HASH = "277ef3785e9e422903bca14e601406368c78ad25e974056604c13abc7e1a56afa8738e7236f10b2a31005d2ad3fe35e40606aad625be104dd8dfb6137021c443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flufl.i18n \
python39-flufl.i18n \
python3dist-flufl.i18n"

RDEPENDS:${PN} += "python-abi \
python39-atpublic"

inherit rpm

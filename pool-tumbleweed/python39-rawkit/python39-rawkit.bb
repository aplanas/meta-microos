SUMMARY = "CTypes based LibRaw bindings"
DESCRIPTION = "The rawkit (pronounced rocket) module is a ctypes-based LibRaw \
binding for Python inspired by the Wand API."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-rawkit-0.6.0-3.7.noarch.rpm"
RPM_HASH = "c05f8b66459c330085a63623dd91b968ae01d059f111f3dc4786aca220e4b28820b8c42fec482c70f27c5e3c8332e589683837f2e031486afbadf1f419f8220a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rawkit \
python39-rawkit \
python3dist-rawkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python310-quantities-0.14.1-1.4.noarch.rpm"
RPM_HASH = "c190bf4cc8f5e825896b276eabd0f866da22eed973a1d2b0198155fd7a6c05f534cda5038dfb9a7498f29e135ef413fabd712748c1f0b101d402fb9db6412a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-quantities \
python310-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm

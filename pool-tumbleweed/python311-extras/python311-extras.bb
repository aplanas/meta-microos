SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-extras-1.0.0-6.2.noarch.rpm"
RPM_HASH = "e0ab8e921666966a58f16e26302ecd3c39f0402cbad425c5a66b590be587536c898ca6768e7abab30d5b1f876dce2546b61cb62e98b974bcb2489f9a587c2bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extras \
python3.11dist-extras \
python311-extras \
python3dist-extras"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-extras-1.0.0-6.2.noarch.rpm"
RPM_HASH = "88c31d0d34215c831bd4d6d7119de5105089e21761d4ec7f17369b9f90992060cc9ffc1cb6d71344100e387f9c714659ff3dad2fc08defd7a8e49b212dab3e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-extras \
python39-extras \
python3dist-extras"

RDEPENDS:${PN} += "python-abi"

inherit rpm

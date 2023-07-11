SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-extras-1.0.0-6.2.noarch.rpm"
RPM_HASH = "39b4a6596941feae8ffe4e4491e16988a4f6929c4e9eea258695448bcb2744143c1a3b6dd47ef8b081fff7b3656f1b031e9e72da3771f2de11d916dd1a0f0cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-extras \
python310-extras \
python3dist-extras"

RDEPENDS:${PN} += "python-abi"

inherit rpm

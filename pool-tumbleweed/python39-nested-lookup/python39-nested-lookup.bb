SUMMARY = "Python functions for working with deeply nested documents (lists and dicts)"
DESCRIPTION = "Python functions for working with deeply nested documents (lists and dicts)"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.25"

RPM_NAME = "python39-nested-lookup-0.2.25-1.4.noarch.rpm"
RPM_HASH = "a5a5a3bf2c58a34d04fd51fae82ed84ff0bbf4c6fcb5934000b4e850c1f8602ff76f7eaf4adcef1f6b4bfbe4459f3908a28773e747eb6b4181f298f8f791d4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nested-lookup \
python39-nested-lookup \
python3dist-nested-lookup"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm

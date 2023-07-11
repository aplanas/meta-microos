SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python311-xdoctest-1.1.1-1.3.noarch.rpm"
RPM_HASH = "41b66e3a7371bbe44efee2892bddcb27e18fe2dd62309ec0603dbf2a27c5aa93ac6f4a4b20749b69adc13db5f2b0d900bfc5fec0d9e7feb837fece75e54ad98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdoctest \
python3.11dist-xdoctest \
python311-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

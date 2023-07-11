SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-mypy-protobuf-3.2.0-1.15.noarch.rpm"
RPM_HASH = "194ed0033d0b394efdab5e5b0e933fa9a04dd1938f3dc4738dec36807970cb1e582be19aab01003889ffc106a5268438feb7b876a7d1da7c95b468eee36e844d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mypy-protobuf \
python310-mypy-protobuf \
python3dist-mypy-protobuf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-protobuf \
update-alternatives"

inherit rpm

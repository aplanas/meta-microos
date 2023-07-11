SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-mypy-protobuf-3.2.0-1.15.noarch.rpm"
RPM_HASH = "95af49467d0d914374ef0e1ff0c361ed2209acf9813b6a406a39cf774f4a3799315e18fb19cf37b7a42dc9859f8e00986f403de3c904226c0d0e0eadc3e557fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mypy-protobuf \
python3.11dist-mypy-protobuf \
python311-mypy-protobuf \
python3dist-mypy-protobuf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-protobuf \
update-alternatives"

inherit rpm

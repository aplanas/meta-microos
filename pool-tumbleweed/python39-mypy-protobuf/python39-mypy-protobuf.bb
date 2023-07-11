SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-mypy-protobuf-3.2.0-1.15.noarch.rpm"
RPM_HASH = "1e19ec131aa55109673ea008585f17bfa6a24501da8e34dd2adca63ea91b648623f6a3c7c13858053e58b7f4e7c57323584896620714f1465641b25e4ce5504a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mypy-protobuf \
python39-mypy-protobuf \
python3dist-mypy-protobuf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-protobuf \
update-alternatives"

inherit rpm

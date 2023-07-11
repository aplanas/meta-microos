SUMMARY = "Generate spec files from Jinja2 templates"
DESCRIPTION = "renderspec is a tool to convert a .spec.j2 Jinja2 template to \
a rpm .spec file which is usable for different distributions \
and follow their policies and processes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python3-renderspec-2.2.0-2.3.noarch.rpm"
RPM_HASH = "d260785449ca45d3381b5ce15d0d19b8d66f50d6c3c82853c990487bcda31672b10bc3bb40a6a74dfbef92a5c0ec17b47ae4f9a02fc59afeed342c068f9fec73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-renderspec \
python3.11dist-renderspec \
python3dist-renderspec"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-packaging \
python3-pymod2pkg"

inherit rpm

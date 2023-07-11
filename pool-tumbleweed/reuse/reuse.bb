SUMMARY = "A tool for compliance with the REUSE recommendations"
DESCRIPTION = "A tool for compliance with the REUSE recommendations.  Essentially, \
it is a linter that checks for a project's compliance, and a compiler that \
generates a project's bill of materials."
LICENSE = "Apache-2.0 & CC-BY-SA-4.0 & GPL-3.0-or-later & CC0-1.0"

PV = "1.1.2"

RPM_NAME = "reuse-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "4c4a917cd149128925515f71bc1be77d4d50bcf437fba40b38b39b5a2d8af2c3b279b250fab63b9c016e42a506984951d79ce9edea497645132fca9d0843b60e"

RPROVIDES:${PN} += "python3.11dist-reuse \
python3dist-reuse \
reuse"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3 \
python3-Jinja2 \
python3-binaryornot \
python3-boolean.py \
python3-debian \
python3-license-expression \
python3-setuptools"

inherit rpm

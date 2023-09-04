SUMMARY = "A tool for compliance with the REUSE recommendations"
DESCRIPTION = "A tool for compliance with the REUSE recommendations.  Essentially, \
it is a linter that checks for a project's compliance, and a compiler that \
generates a project's bill of materials."
LICENSE = "Apache-2.0 & CC-BY-SA-4.0 & GPL-3.0-or-later & CC0-1.0"

PV = "2.1.0"

RPM_NAME = "reuse-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "da53a1e8b0d03f104508fbf19afeb7b8e640a5f1c0392ba160ef6396a7d147962a19afd2a2232d49c47f37918462ab81c860911215bb0e626a49c000bb1987bc"

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

SUMMARY = "A tool for compliance with the REUSE recommendations"
DESCRIPTION = "A tool for compliance with the REUSE recommendations.  Essentially, \
it is a linter that checks for a project's compliance, and a compiler that \
generates a project's bill of materials."
LICENSE = "Apache-2.0 & CC-BY-SA-4.0 & GPL-3.0-or-later & CC0-1.0"

PV = "1.1.2"

RPM_NAME = "reuse-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "d04e92b274c6d63779279fbb7f341327f1f3d70ed5abc9cb083bc41123aa3ab94b9985a8ba9e0e84c0a98fbe957fbe0737db432cbb152098a656cab5f457311e"

RPROVIDES:${PN} += "python3.10dist(reuse) \
python3dist(reuse) \
reuse \
reuse(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python(abi) \
python3 \
python3-Jinja2 \
python3-binaryornot \
python3-boolean.py \
python3-debian \
python3-license-expression \
python3-setuptools"

inherit rpm

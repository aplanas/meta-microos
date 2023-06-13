SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python311-dogslow-1.2-1.14.noarch.rpm"
RPM_HASH = "d2b8b7c47115ec9c9df87fe5ac26e3c8f57f77fd3f10b8dbab29f4a328e12e964af875b9ad96adf74493fd7a8915ef027938f13483e47a7c1bc4b5e3a3bf4f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dogslow) \
python311-dogslow \
python3dist(dogslow)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

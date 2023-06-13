SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-pyperf-2.5.0-1.4.noarch.rpm"
RPM_HASH = "4b20fcc69d87a8cbe70759854ac4830516e00a02440ba63c90f8a498a18bf0cc1bbd36b780ea1286bfd562fd555475431fc52e89609b736051365c027e07cd14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyperf) \
python311-pyperf \
python3dist(pyperf)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm

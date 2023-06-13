SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.2.3"

RPM_NAME = "python310-hypothesmith-0.2.3-2.1.noarch.rpm"
RPM_HASH = "4dee5af3c9ab965d48a96db04eb4df84bc8128fb67870bbbc5350f5c085931db2f68cfa3fd1cad3aa4611480752972915dc9931e307e6777934b4fe9dc41da7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesmith \
python3.10dist(hypothesmith) \
python310-hypothesmith \
python3dist(hypothesmith)"

RDEPENDS:${PN} += "python(abi) \
python310-base \
python310-hypothesis \
python310-lark \
python310-libcst"

inherit rpm

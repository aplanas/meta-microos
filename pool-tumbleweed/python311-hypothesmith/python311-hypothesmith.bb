SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.2.3"

RPM_NAME = "python311-hypothesmith-0.2.3-2.1.noarch.rpm"
RPM_HASH = "85e205dec1d768607fa1d9fcd18dcb007d3ac9f53b72c3a1899817e3a6d8838a72bac510d917e41c85aa91f0693182fb5e00acaf17dacfde836e00c3a89146ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hypothesmith) \
python311-hypothesmith \
python3dist(hypothesmith)"

RDEPENDS:${PN} += "python(abi) \
python311-base \
python311-hypothesis \
python311-lark \
python311-libcst"

inherit rpm

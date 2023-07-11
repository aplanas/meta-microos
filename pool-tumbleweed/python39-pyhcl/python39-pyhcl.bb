SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.4"

RPM_NAME = "python39-pyhcl-0.4.4-2.16.noarch.rpm"
RPM_HASH = "a656f66bbef7364f9afdf6d313f15281e28e65876e3b60521101095db9bd8ecaba1825af4545b21f50d4124c5b732d2e0bc35ae3ab68f178e2f2f2523d178aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyhcl \
python39-pyhcl \
python3dist-pyhcl"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python39-visitor-0.1.3-1.20.noarch.rpm"
RPM_HASH = "126f89ebf5be66c407d8a6e4d32391ef216448c1f7643216ca7a3d038255b0af0cadb791a369c4763bd7f57deac1aefdaee698ffd2bbe2c08927e5e47ff23941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-visitor \
python39-visitor \
python3dist-visitor"

RDEPENDS:${PN} += "python-abi"

inherit rpm

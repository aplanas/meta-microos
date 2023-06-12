SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python311-LTTL-2.0.12-2.9.noarch.rpm"
RPM_HASH = "943b50af38ac306a779a010eaf19c82bcfe696019bf461bed8c735792a9b6032964ec5c32208180211af68f9238d474a1646d3c94d521b52682e32a470735474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lttl) \
python311-LTTL \
python3dist(lttl)"
RDEPENDS:${PN} += "python(abi) \
python311-future \
python311-numpy \
python311-scipy"

inherit rpm

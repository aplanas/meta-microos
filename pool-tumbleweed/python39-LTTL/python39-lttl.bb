SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python39-LTTL-2.0.12-2.11.noarch.rpm"
RPM_HASH = "8670380289e570e625a589ff2dcb0dfab9b533a570f290eff76761eca1ce57a124803ad559df4c236bd79891afca4146ebeb2d3e77fc5d96e922c4bda244419c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lttl \
python39-LTTL \
python3dist-lttl"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-numpy \
python39-scipy"

inherit rpm

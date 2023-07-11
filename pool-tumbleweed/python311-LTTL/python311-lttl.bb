SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python311-LTTL-2.0.12-2.11.noarch.rpm"
RPM_HASH = "09bbcaecb23b19bd9e7eec06e7f059dd626df29ae17f8412bd9c8e41c6fcfab0a1d7303ae324fb9df56e4539a8e3fecb27a7f9bd68e4c7cac7d731ed75fdb26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-LTTL \
python3.11dist-lttl \
python311-LTTL \
python3dist-lttl"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-numpy \
python311-scipy"

inherit rpm

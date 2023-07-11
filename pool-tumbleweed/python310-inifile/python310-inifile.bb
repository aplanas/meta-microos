SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python310-inifile-0.4.1-1.8.noarch.rpm"
RPM_HASH = "05f0187e5e61d70f880edcbba4ce107140b472dda4539d2f7337de263ec24ec2260752db81a9b120b38ea0fbba3402ae5e653367c0389d54834063414f0605df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-inifile \
python310-inifile \
python3dist-inifile"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-TagStats-0.1.2-4.15.noarch.rpm"
RPM_HASH = "4ae3f9abae2be87e55b4632c0ba559d9badcedb8083b7a8bbad14a7f32b0652ab57f16a5b7c046af3f51424ae9d94e23c13e570081c247ae358fac45dc59e2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tagstats \
python39-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm

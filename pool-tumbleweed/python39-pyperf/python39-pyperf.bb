SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-pyperf-2.5.0-1.4.noarch.rpm"
RPM_HASH = "13b1790c801e097dc31018646b04bc3a6aa26ceca1ec5708ecd076cca67ac66db079a19e0e3d866eebe379f605223445b14a7243baabf0dfb595cf112f07b311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyperf \
python39-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

SUMMARY = "Test data for python39-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-testdata-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "c94e7870504e9978589dfb278643ded1c72f1354d959b691bd687065983fe2ea534e94f3a27c0d6d913bca22d209a8fa24d7dce4927574de10d0c0d74b2d88b8"

RPROVIDES:${PN} += "python39-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib"

inherit rpm

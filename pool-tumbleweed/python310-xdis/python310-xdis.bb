SUMMARY = "Python cross-version byte-code disassembler and marshal routines"
DESCRIPTION = "Python cross-version byte-code disassembler and marshal routines."
LICENSE = "GPL-2.0-only"

PV = "6.0.5"

RPM_NAME = "python310-xdis-6.0.5-1.4.noarch.rpm"
RPM_HASH = "b00ab1f569ca5043102eeb1028a4790b15f4aa983c1e1adefc1a9dac6d156e5372cbfba1f619c3911daa60b0ef2cfe8052067ca07eda7eb1c824f44d1e1d0fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xdis \
python310-xdis \
python3dist-xdis"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm

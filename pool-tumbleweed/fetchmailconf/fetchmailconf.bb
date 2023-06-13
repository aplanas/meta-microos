SUMMARY = "Fetchmail Configuration Utility"
DESCRIPTION = "A GUI configuration utility for generating fetchmail configuration \
files (.fetchmailrc)."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.37"

RPM_NAME = "fetchmailconf-6.4.37-1.3.aarch64.rpm"
RPM_HASH = "c472bdc82c1549dbf869cf765cfb30604155f44186078482e6f8239e12bef4c61dfaef22f2c3e0a35220e5651ff40dc386dc9b0bb6568ba444e856478eca6caa"

RPROVIDES:${PN} += "fetchmailconf \
fetchmailconf(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fetchmail \
python(abi) \
python3 \
python3-future \
python3-tk"

inherit rpm

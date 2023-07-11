SUMMARY = "Fetchmail Configuration Utility"
DESCRIPTION = "A GUI configuration utility for generating fetchmail configuration \
files (.fetchmailrc)."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.37"

RPM_NAME = "fetchmailconf-6.4.37-1.5.aarch64.rpm"
RPM_HASH = "922bf5361b78b522b70429d1fef39f206fdc0cf8e569cc71c4d511b7768bbd676c410db8f847579437e5cee110f88e039ad44b3a6e4dd817e78248cb40853dcc"

RPROVIDES:${PN} += "fetchmailconf"

RDEPENDS:${PN} += "/usr/bin/sh \
fetchmail \
python-abi \
python3 \
python3-future \
python3-tk"

inherit rpm

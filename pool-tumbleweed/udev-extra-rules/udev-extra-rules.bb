SUMMARY = "SUSE specific hardware tuning rules"
DESCRIPTION = "This package contains SUSE specific hardware tunings common to all SUSE brands."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "udev-extra-rules-0.2-1.7.noarch.rpm"
RPM_HASH = "2b34cb7e8e4a6fe6c4a79d35414b1a5f67ef785fcda01cb50a65ed2e7d88342b09c3e036c0d8fc883e741775d22cc0bfe68188dd7fc453d5a3f3edd44b3a3aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-tuning-common-SUSE \
udev-extra-rules"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm

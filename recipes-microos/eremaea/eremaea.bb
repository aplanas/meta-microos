SUMMARY = "Systemd unit files for python-django-eremaea2"
DESCRIPTION = "This package contains the systemd unit files for python-django-eremaea2."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "eremaea-2.0.18-1.1.noarch.rpm"
RPM_HASH = "556d72c3baabb1f8cde70fc41435b8b40d56a3f67f95083670b35c4a7a1d8ef10d7b0a657a6f1f4a30d7c25a8de9ec988490b9faf272a8c195313ba7a6a2df91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eremaea"
RDEPENDS:${PN} += "/bin/sh /usr/bin/eremaeactl"

inherit rpm

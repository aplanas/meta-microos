SUMMARY = "Systemd unit files for python-django-eremaea2"
DESCRIPTION = "This package contains the systemd unit files for python-django-eremaea2."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "eremaea-2.0.18-2.1.noarch.rpm"
RPM_HASH = "80804ac9e7b1e2aea1f6085b7b3f8453c52026f5b1c98815ffc44b3f5dac44d2b5fa0eaa453b4a6ebeea358770a7e374d6907b627d6b5928c4ae9d29d3a7ff0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eremaea"

RDEPENDS:${PN} += "/usr/bin/eremaeactl \
/usr/bin/sh"

inherit rpm

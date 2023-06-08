SUMMARY = "Systemd unit files for python-django-eremaea2"
DESCRIPTION = "This package contains the systemd unit files for python-django-eremaea2."
LICENSE = "BSD-2-Clause"

PV = "2.0.17"

RPM_NAME = "eremaea-2.0.17-3.1.noarch.rpm"
RPM_HASH = "2999b3c457a0d0ca8f3358545b41734afc9cf293c6067fad81ba06312f0287dbcfcf3587ecd688f905157b414e250825559d5f2b3ae5ce5de34f605364069fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eremaea"
RDEPENDS:${PN} += "/bin/sh /usr/bin/eremaeactl"

inherit rpm

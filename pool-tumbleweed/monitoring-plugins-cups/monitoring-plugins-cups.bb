SUMMARY = "Check cups service"
DESCRIPTION = "Check the status of a remote CUPS server, all printers there \
or one selected. It can also check queue there: \
it will provide the size of the queue of age of queue."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-cups-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "fa8ca80a3d9f5eca374b0a47616512e3cd33af0b7ae96bc4e8857cc22ba0ccb64f831cfa3d5ba490afc5c35d1e2a9baebf29700ed83339c2829173486bb003fe"

RPROVIDES:${PN} += "config-monitoring-plugins-cups \
monitoring-plugins-cups \
nagios-plugins-cups"

RDEPENDS:${PN} += "/usr/bin/bash \
cups-client"

inherit rpm

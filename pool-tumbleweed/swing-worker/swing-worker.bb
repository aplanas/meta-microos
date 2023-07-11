SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-1.2-26.7.noarch.rpm"
RPM_HASH = "7f5e42f0eea0d00cfb8fbad5ef31c780a09ebd0b3c7ef7e1aaf510bae2c292bcd391ae5bac93f6591267498dc8bdf64c48d84b25af42bb519c189c49ba595241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker"

RDEPENDS:${PN} += "java"

inherit rpm

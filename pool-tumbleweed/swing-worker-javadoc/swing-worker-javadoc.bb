SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-javadoc-1.2-26.7.noarch.rpm"
RPM_HASH = "d57944b8a650e7f6af05922a032973ceba46c87181ca6d49e1201af8f91322f597e82c326af7d8e00557a4d0dd46301e50113731546a47201bd6fbdf275624b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

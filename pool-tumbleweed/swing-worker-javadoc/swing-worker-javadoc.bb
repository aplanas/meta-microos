SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-javadoc-1.2-26.6.noarch.rpm"
RPM_HASH = "9084a9c70e48456c35bd70fc5ab09e4210e4806343b6d2e27b59c1b292a9e23e85a93d4994f981ecab2dc4e1f37aaf3ff6b3519096f2ad378f4016a86fe95d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

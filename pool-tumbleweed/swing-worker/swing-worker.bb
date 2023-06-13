SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-1.2-26.6.noarch.rpm"
RPM_HASH = "0747c0a5012600756ef105585912ec5ab383e7a954a7f8d7a985a8325e2caabe005e256b6d45466000cc0548dff65d361be7c4ee71bd298e7b6e848962b648d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker"

RDEPENDS:${PN} += "java"

inherit rpm

SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-demo-1.2-26.7.noarch.rpm"
RPM_HASH = "ab6ec95b3e0cd69ed3f8eb901cadba1d411d8079e12a42dae0059065c57f7e693b58ad1dc27f225718e417dad2b04886de5b9779f58be99778b95a1e7a8b961a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker-demo"

RDEPENDS:${PN} += "swing-worker"

inherit rpm

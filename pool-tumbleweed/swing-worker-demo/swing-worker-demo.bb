SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-demo-1.2-26.6.noarch.rpm"
RPM_HASH = "a8398cb5f94c05fe5c109280bec1c9ce4147d1cf3d9318bf6a36e2959f200bc9ea4b6e7553c5adf9818e34410998aa162de36d88b78efcf3d6b5d913dcbec135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker-demo"

RDEPENDS:${PN} += "swing-worker"

inherit rpm

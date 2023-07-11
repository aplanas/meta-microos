SUMMARY = "Python module for watching filesystems changes"
DESCRIPTION = "pyinotify is a Python module for watching filesystems changes. By its design \
pyinotify can be used for any kind of fs monitoring. \
 \
pyinotify relies on a recent Linux Kernel feature (merged in kernel 2.6.13) \
called inotify. inotify is an event-driven notifier, its notifications are \
exported from kernel space to user space. The raw interface of inotify is \
compounded of three system calls. pyinotify binds these system calls and \
provides an implementation on top of them offering a generic and abstract way \
to use inotify with Python. Pyinotify doesn't requires much detailed knowledge \
of inotify. Moreover, it only needs few statements for initializing, watching, \
handling (eventually trough a new separate thread), and processing events \
notifications through subclassing. The only things to know is the path of items \
to watch, the kind of events to monitor and the actions to execute on these \
notifications."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "python311-pyinotify-0.9.6-5.2.noarch.rpm"
RPM_HASH = "1d94227ba3be985b64c2e93639ef6cb39f1c1f12fdd99431daf677fbbcb796179c1fedbb2b89f075c1401c599b5c17c8bced34af5f4592d22ab21d7cbd840148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyinotify \
python3.11dist-pyinotify \
python311-pyinotify \
python3dist-pyinotify"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

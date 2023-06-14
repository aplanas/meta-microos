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

RPM_NAME = "python311-pyinotify-0.9.6-5.1.noarch.rpm"
RPM_HASH = "4551daa899b04e7794efa23e3ec3dfe6cef7b3a0354df9ab3428e2c88a923d6ba637dee23f7615c3cfe90e39df1e5b6e4cfbf4f9b9992570e462b66444711b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyinotify \
python311-pyinotify \
python3dist-pyinotify"

RDEPENDS:${PN} += "/bin/sh \
python-abi \
update-alternatives"

inherit rpm

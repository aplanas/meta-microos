SUMMARY = "Keyboard-oriented customizable and extensible web browser"
DESCRIPTION = "Conkeror is a keyboard-oriented, highly-customizable, \
highly-extensible web browser based on Mozilla XULRunner, written \
mainly in JavaScript, and inspired by exceptional software such as \
Emacs and vi. Conkeror features a sophisticated keyboard system, \
allowing users to run commands and interact with content in powerful \
and novel ways. It is self-documenting, featuring a powerful \
interactive help system."
LICENSE = "MPL-1.1 | GPL-2.0 | LGPL-2.1"

PV = "1.0.4"

RPM_NAME = "conkeror-1.0.4-1.20.aarch64.rpm"
RPM_HASH = "2033a87fe93d5557942948c0e7bdfdb72fdad6cebfdc1f0153c4b80ecd2134e3775604a61bafddc905c477a23895b29ad5984b8f17e1cb80095fc328ee0093c1"

RPROVIDES:${PN} += "conkeror"

RDEPENDS:${PN} += "/bin/sh \
firefox \
libc.so.6"

inherit rpm

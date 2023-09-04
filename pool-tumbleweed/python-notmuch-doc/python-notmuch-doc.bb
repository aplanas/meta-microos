SUMMARY = "Documentation of Python bindings for notmuch"
DESCRIPTION = "Documentation of Python interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "python-notmuch-doc-0.37-3.1.aarch64.rpm"
RPM_HASH = "9e5e9ec3249ccb0e75d835a509407d299dc136f8ea548df4ef58027532b44e09105628737e6f6fb675ff4890e9108de6776e0450d9b89962b3b6fd346eb66a67"

RPROVIDES:${PN} += "python-notmuch-doc"

RDEPENDS:${PN} += ""

inherit rpm

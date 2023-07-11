SUMMARY = "Documentation of Python bindings for notmuch"
DESCRIPTION = "Documentation of Python interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "python-notmuch-doc-0.37-2.6.aarch64.rpm"
RPM_HASH = "5b29df6e559caa2e85da60f22e98da62cac3a115420da5e57c0887231be8573e1899c779268a453d28568efa4e3ebe137376197d222ad9a5a8e0ef4f5cb901ed"

RPROVIDES:${PN} += "python-notmuch-doc"

RDEPENDS:${PN} += ""

inherit rpm

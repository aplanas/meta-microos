SUMMARY = "Java NFA regular expression engine"
DESCRIPTION = "The gnu-regexp package is a pure-Java implementation of a traditional \
(non-POSIX) NFA regular expression engine. Its syntax can emulate many \
popular development tools, including awk, sed, emacs, perl and grep. \
For a relatively complete list of supported and non-supported syntax, \
refer to the syntax and usage notes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-1.1.4-293.14.noarch.rpm"
RPM_HASH = "a639e822afc87e83e56aa1bb56d3802071742cde4501edfe631c4756989e087cee13a29f6d3687f6db27b7587d5585440f67d5c56f62ba9cf2010193c8cf61da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Java NFA regular expression engine"
DESCRIPTION = "The gnu-regexp package is a pure-Java implementation of a traditional \
(non-POSIX) NFA regular expression engine. Its syntax can emulate many \
popular development tools, including awk, sed, emacs, perl and grep. \
For a relatively complete list of supported and non-supported syntax, \
refer to the syntax and usage notes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-1.1.4-293.13.noarch.rpm"
RPM_HASH = "69c26231eda7f5717d894dfeee0fcc7d0aede26454076bd392a3c9070a9b1d3a6e33330801d13bd5610dc8c572dfa7822afd86fce6574e359f144755482e0a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "A Program for Automatically Generating GNU-Style Makefile.in Files"
DESCRIPTION = "Automake is a tool for automatically generating 'Makefile.in' files \
from 'Makefile.am' files.  'Makefile.am' is a series of 'make' macro \
definitions (with rules occasionally thrown in).  The generated \
'Makefile.in' files are compatible with the GNU Makefile standards."
LICENSE = "GFDL-1.3-or-later & GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "1.16.5"

RPM_NAME = "automake-1.16.5-3.7.noarch.rpm"
RPM_HASH = "707abc9f2f9956f7d0b5d4d63475fd46e1033463a5b244dc6fc495e0f345a58b987e73f44733f700eb59568ae250c41cd99c31141541dc0b1ec94f75a3791ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "automake config(automake)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl autoconf info perl"

inherit rpm

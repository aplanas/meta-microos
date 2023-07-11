SUMMARY = "A Program for Automatically Generating GNU-Style Makefile.in Files"
DESCRIPTION = "Automake is a tool for automatically generating 'Makefile.in' files \
from 'Makefile.am' files.  'Makefile.am' is a series of 'make' macro \
definitions (with rules occasionally thrown in).  The generated \
'Makefile.in' files are compatible with the GNU Makefile standards."
LICENSE = "GFDL-1.3-or-later & GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "1.16.5"

RPM_NAME = "automake-1.16.5-3.8.noarch.rpm"
RPM_HASH = "336c37181585606bc10ee22246e33bee157450af6aef361b911cd4d7be76531596f189361d38bc1d5041deb135186a18bf16c17213dcf667f10421e10a5d91b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "automake \
config-automake"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
autoconf \
info \
perl"

inherit rpm

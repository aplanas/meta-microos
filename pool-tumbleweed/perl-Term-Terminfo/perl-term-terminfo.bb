SUMMARY = "Access the terminfo database"
DESCRIPTION = "Objects in this class provide access to _terminfo_ database entires. \
 \
This database provides information about a terminal, in three separate sets \
of capabilities. Flag capabilities indicate the presence of a particular \
ability, feature, or bug simply by their presence. Number capabilities give \
the size, count or other numeric detail of some feature of the terminal. \
String capabilities are usually control strings that the terminal will \
recognise, or send. \
 \
Capabilities each have two names; a short name called the capname, and a \
longer name called the varname. This class provides two sets of methods, \
one that works on capnames, one that work on varnames. \
 \
This module optionally uses _unibilium_ to access the terminfo(5) database, \
if it is available at compile-time. If not, it will use _<term.h>_ and \
_-lcurses_. For more detail, see the SEE ALSO section below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Term-Terminfo-0.09-1.14.aarch64.rpm"
RPM_HASH = "971f482d700c45e27d5b9de9ca0514c4ebf597ea7154a2c6816989a9cdea0f9654fdf242480e4c2d3703a16a1cabc277fdda8181ae4804bfd9079e24b063289f"

RPROVIDES:${PN} += "perl-Term--Terminfo \
perl-Term-Terminfo"

RDEPENDS:${PN} += "libc.so.6 \
libtinfo.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

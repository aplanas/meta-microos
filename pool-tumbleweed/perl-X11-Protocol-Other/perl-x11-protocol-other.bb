SUMMARY = "Miscellaneous X11::Protocol helpers"
DESCRIPTION = "This is some helper functions for 'X11::Protocol'."
LICENSE = "GPL-1.0-or-later"

PV = "31"

RPM_NAME = "perl-X11-Protocol-Other-31-1.15.aarch64.rpm"
RPM_HASH = "6bbba4aaf6618a9032b9f5bb3a30b552e25c3bc03c5f71f6a195b59eb4031f091df27b871581b14465e315921fec50264255b3be19db72226574d87a64801cc2"

RPROVIDES:${PN} += "perl-Encode--X11 \
perl-X11--AtomConstants \
perl-X11--CursorFont \
perl-X11--Protocol--ChooseWindow \
perl-X11--Protocol--Ext--Composite \
perl-X11--Protocol--Ext--DAMAGE \
perl-X11--Protocol--Ext--DOUBLE-BUFFER \
perl-X11--Protocol--Ext--MIT-SCREEN-SAVER \
perl-X11--Protocol--Ext--MIT-SHM \
perl-X11--Protocol--Ext--MIT-SUNDRY-NONSTANDARD \
perl-X11--Protocol--Ext--TOG-CUP \
perl-X11--Protocol--Ext--X-Resource \
perl-X11--Protocol--Ext--XFIXES \
perl-X11--Protocol--Ext--XFree86-DGA \
perl-X11--Protocol--Ext--XINERAMA \
perl-X11--Protocol--Ext--XTEST \
perl-X11--Protocol--GrabServer \
perl-X11--Protocol--Other \
perl-X11--Protocol--WM \
perl-X11--Protocol--XSetRoot \
perl-X11-Protocol-Other"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-X11--Protocol"

inherit rpm

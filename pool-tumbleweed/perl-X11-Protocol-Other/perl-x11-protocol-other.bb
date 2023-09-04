SUMMARY = "Miscellaneous X11::Protocol helpers"
DESCRIPTION = "This is some helper functions for 'X11::Protocol'."
LICENSE = "GPL-1.0-or-later"

PV = "31"

RPM_NAME = "perl-X11-Protocol-Other-31-1.17.aarch64.rpm"
RPM_HASH = "c90134021843e0f9c8a386fa3a17e940ac629cc9bcbafae79671dafc114780684cd426b1c978ccd3e076ae82c8f4ef84256228231c48934cf5d78a1bc1f619c8"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-X11--Protocol"

inherit rpm

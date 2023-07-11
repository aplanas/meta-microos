SUMMARY = "Miscellaneous X11::Protocol helpers"
DESCRIPTION = "This is some helper functions for 'X11::Protocol'."
LICENSE = "GPL-1.0-or-later"

PV = "31"

RPM_NAME = "perl-X11-Protocol-Other-31-1.16.aarch64.rpm"
RPM_HASH = "deafafdcf9cb9d71666e98811d32bfb65816f083abeea25a024dccec4ae8c21332ccd3cc61a2e1ad5cd166b2aa9990233ec1587ed22fc3f3abaf1ee9063522e0"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-X11--Protocol"

inherit rpm

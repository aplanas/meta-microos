SUMMARY = "A collection of simulators of historically significant data processing systems"
DESCRIPTION = "This package contains simulators of the following systems: \
Data General Nova \
Data General Eclipse \
Digital Equipment Corporation PDP-1 \
Digital Equipment Corporation PDP-4 \
Digital Equipment Corporation PDP-7 \
Digital Equipment Corporation PDP-8 \
Digital Equipment Corporation PDP-9 \
Digital Equipment Corporation PDP-10 \
Digital Equipment Corporation PDP-11 \
Digital Equipment Corporation PDP-15 \
Digital Equipment Corporation PDP-18B \
IBM 1401 \
IBM System 3 \
Hewlett-Packard HP 2100 \
Honeywell H316 \
MITS Altair 8800 \
 \
A disk image with UNIX V7 for the PDP-11 is included, instructions on \
how to make it work can be found in the file \
/usr/share/doc/packages/simh/simh_swre.txt in chapter 2.1.3. \
 \
A selection of software for other systems can be found at The Computer \
History Simulation Project at http://simh.trailing-edge.com/"
LICENSE = "BSD-3-Clause"

PV = "3.12_4"

RPM_NAME = "simh-3.12_4-1.1.aarch64.rpm"
RPM_HASH = "566da082469c8db74ae2c367f285728c6069ca0728bcf909ac032cb14e9effa7d629610712273e31dc3a931d5f2d16e225e99428b73ee8ed3db678c2381c954f"

RPROVIDES:${PN} += "simh"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm

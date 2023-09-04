SUMMARY = "Linux/POSIX emulation of Win32::SerialPort functions"
DESCRIPTION = "This module provides an object-based user interface essentially identical \
to the one provided by the Win32::SerialPort module."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Device-SerialPort-1.04-26.39.aarch64.rpm"
RPM_HASH = "6d4dbd887f28d6ab5e97d1b895af87d4dabfd94d41e6c27f67bfa760a24d229b0fa94dcc7cbf2fad9bc91b74ccf1128944567fa5b8f16a7f39ab649effbdb717"

RPROVIDES:${PN} += "Device-SerialPort \
perl-Device--SerialPort \
perl-Device-SerialPort"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

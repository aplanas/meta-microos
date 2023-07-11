SUMMARY = "Linux/POSIX emulation of Win32::SerialPort functions"
DESCRIPTION = "This module provides an object-based user interface essentially identical \
to the one provided by the Win32::SerialPort module."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Device-SerialPort-1.04-26.38.aarch64.rpm"
RPM_HASH = "a9bf39b065685437b414002c44033bc76ccf1f3a8d7d7b4dfeab1d5ac40476986a259b24b2046eeab56006874219ddea92134f871f8ba2ea3870d33493340f58"

RPROVIDES:${PN} += "Device-SerialPort \
perl-Device--SerialPort \
perl-Device-SerialPort"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

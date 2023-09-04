SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python310-pygame-devel-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "05951b8f5f9b72c5ee895fe2fb1e022e285f48a9db24e5a514665e70514d9156fc32b7dae306aa16f09ba744700d5a597fb25cfc8e8a8b8a81ae4b0435d77396"

RPROVIDES:${PN} += "python310-pygame-devel"

RDEPENDS:${PN} += "python310-pygame"

inherit rpm

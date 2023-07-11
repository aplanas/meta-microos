SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python311-pygame-devel-2.1.3-2.2.aarch64.rpm"
RPM_HASH = "b1cbe28c53367505c86b570a94ef1402c8c6e8183f7f0c5198977064d1088609a3df97b8a29740230ac58ec0d5140c1054bcabf09437fd62af6fac39700a5143"

RPROVIDES:${PN} += "python3-pygame-devel \
python311-pygame-devel"

RDEPENDS:${PN} += "python311-pygame"

inherit rpm

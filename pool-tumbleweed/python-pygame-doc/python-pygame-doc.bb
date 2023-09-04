SUMMARY = "Pygame documentation and example programs"
DESCRIPTION = "This package contains documentation and example programs for Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python-pygame-doc-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "3054719a7a1608b1dbdeef00a0a4ed2ffdaf38ec2df07dff97335213d1c70df23205e4ef02415a44b0a9ba2395c9becfc3b4cbffdde42e9f956cb0319fc94fe9"

RPROVIDES:${PN} += "pygame-doc \
python-pygame-doc \
python310-pygame-doc \
python311-pygame-doc \
python39-pygame-doc"

RDEPENDS:${PN} += ""

inherit rpm

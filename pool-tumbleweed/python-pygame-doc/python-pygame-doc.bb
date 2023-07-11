SUMMARY = "Pygame documentation and example programs"
DESCRIPTION = "This package contains documentation and example programs for Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python-pygame-doc-2.1.3-2.2.aarch64.rpm"
RPM_HASH = "4823521fe4255c569f1b22d7e83eebbe16ca124ae05616a67cb48d1c5a68a49f2b4860fe01851ab9157f1eb86a2db102b85cdb709587e1bdfddd331d6b6ad979"

RPROVIDES:${PN} += "pygame-doc \
python-pygame-doc \
python310-pygame-doc \
python311-pygame-doc \
python39-pygame-doc"

RDEPENDS:${PN} += ""

inherit rpm

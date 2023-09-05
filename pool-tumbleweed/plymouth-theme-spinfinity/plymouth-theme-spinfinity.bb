SUMMARY = "Plymouth 'Spinfinity' theme"
DESCRIPTION = "This package contains the 'Spinfinity' boot splash theme for \
Plymouth. It features a centered logo and animated spinner that \
spins in the shape of an infinity sign."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinfinity-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "1962b4c7bc37eed8e364a58e275af4ba24855e5bcedaadc796d16c1ca0db2354d92f3f032fc8151a49a3ae86b245a654a2ec0bec149fb36a7232d0003e05259b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinfinity"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth \
plymouth-scripts"

inherit rpm

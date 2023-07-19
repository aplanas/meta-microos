SUMMARY = "Plymouth 'Solar' theme"
DESCRIPTION = "This package contains the 'Solar' boot splash theme for \
Plymouth. It features a blue flamed sun with animated solar flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-solar-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "f16791bdde9213f57a1ca9912c9ab6aebf28112d3987fb532a24d9fd013d79a3a567742f9e5db7772201e613ec33c789ca5443f98ac0b02514849989dbe5e5b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-solar"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-space-flares \
plymouth-scripts"

inherit rpm

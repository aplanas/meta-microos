SUMMARY = "freedesktop.org sound theme"
DESCRIPTION = "The default freedesktop.org sound theme following the XDG theming \
specification.	(http://0pointer.de/public/sound-theme-spec.html)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "sound-theme-freedesktop-0.8-9.11.noarch.rpm"
RPM_HASH = "e66bdd228060a9c199ea267e80d48e6d7e3a4aa774a1781164a05b2b883f9dc9dca1c35f30f92d38a9c9cd6e11272d1b627c8bae1402557461b4633f31c4b632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sound-theme-freedesktop"

RDEPENDS:${PN} += "/bin/sh \
/bin/touch"

inherit rpm

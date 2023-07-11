SUMMARY = "Translations for package tuner"
DESCRIPTION = "Provides translations for the 'tuner' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "tuner-lang-1.5.1-1.8.noarch.rpm"
RPM_HASH = "893db9fdf5fd69332e784c3ba97ac4bc940f0d347fc35b0c4bfb479535be8159e210266d3d93de11e7a70dd5db7128cb6eb4228c8584a75d802497ec0716c20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tuner-de \
locale-tuner-fr \
locale-tuner-it \
locale-tuner-nl \
locale-tuner-tr \
tuner-lang \
tuner-lang-all"

RDEPENDS:${PN} += "tuner"

inherit rpm

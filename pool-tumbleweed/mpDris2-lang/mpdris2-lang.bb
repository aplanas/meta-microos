SUMMARY = "Translations for package mpDris2"
DESCRIPTION = "Provides translations for the 'mpDris2' package."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-lang-0.9.1-1.2.noarch.rpm"
RPM_HASH = "23d623bfa7b64df8ce170534dd9052395f919fba9018eb0c221824b3b95f414c84a2186aef0888ef2fdd6a794e1306cce88a3a86c20e8e912784b95c1d2dad83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mpDris2-fr \
locale-mpDris2-nl \
mpDris2-lang \
mpDris2-lang-all"

RDEPENDS:${PN} += "mpDris2"

inherit rpm

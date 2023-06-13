SUMMARY = "Slovenian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Slovenian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-sl-2.10.0-2.5.noarch.rpm"
RPM_HASH = "5a031003220086fa8cc63b83c7106e28cc3cdd15455ee1c80673766dbfbd8c79846cec4255aaa0cba554d2eb07fe4e1c93b931ffd01a1a67a4b6b881d6eb3666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-sl \
locale(gimp-help:sl)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

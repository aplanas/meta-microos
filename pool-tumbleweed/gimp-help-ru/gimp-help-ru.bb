SUMMARY = "Russian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Russian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-ru-2.10.0-2.5.noarch.rpm"
RPM_HASH = "b4ae86a3d27ce9601f85e11de2fb79882420aa47b0fbbcf4ae6316f16cb177b801f5059dc79405782fa70f28f2f65519c5bdff72dbbc11256152ff34ac293b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-ru \
locale-gimp-help-ru"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

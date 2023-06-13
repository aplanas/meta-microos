SUMMARY = "Danish Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Danish data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-da-2.10.0-2.5.noarch.rpm"
RPM_HASH = "fddf529f23ca205dfd32636c28cbfa3839fabe556a164cacc921579e4d1b3b3e1d1958b567aac9835efdadd6a2872a51f4e8d49435746bd4e4e04840e7a145b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-da \
locale(gimp-help:da)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

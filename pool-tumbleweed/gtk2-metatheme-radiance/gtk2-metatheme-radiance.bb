SUMMARY = "Radiance Gtk Theme -- GTK+ 2 Support"
DESCRIPTION = "Includes an Radiance dark-on-light theme. \
 \
Introduced as one of the defaults in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk2-metatheme-radiance-20.10-2.2.noarch.rpm"
RPM_HASH = "6ae65c5d1a9c694acc101995a5329db8dd84f4e664fd04a32f8a04c84d3a58512b378e847ef493d7627171ba6a88701b0f5424aa6d28a3d402cc23e3cef1456f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-radiance"
RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-radiance-common"

inherit rpm

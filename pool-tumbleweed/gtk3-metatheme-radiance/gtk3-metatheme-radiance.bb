SUMMARY = "Radiance Gtk Theme -- GTK+ 3 Support"
DESCRIPTION = "Includes an Radiance dark-on-light theme. \
 \
Introduced as one of the defaults in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk3-metatheme-radiance-20.10-2.2.noarch.rpm"
RPM_HASH = "23d313a7fe14576006248a3bbfe74f344f580573b944df2cc38e86759eb04f844057eff54a8605a3b926cd0755981bfe41adfe6066b7a31de531835fdc4b5791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-radiance"
RDEPENDS:${PN} += "metatheme-radiance-common"

inherit rpm

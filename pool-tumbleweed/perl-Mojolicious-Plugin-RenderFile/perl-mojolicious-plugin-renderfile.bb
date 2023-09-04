SUMMARY = "'render_file' helper for Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::RenderFile is a Mojolicious plugin that adds \
'render_file' helper. It does not read file in memory and just streaming it \
to a client."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Mojolicious-Plugin-RenderFile-0.12-3.19.noarch.rpm"
RPM_HASH = "7323d39775ff301bf3956b5e8d3010a2d9ad8821682d64ed6c7161060a044ce4ae6e932a1a49652bafc4fdd273baef822e63175bc7dce364ed3e2e0ae85087ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--RenderFile \
perl-Mojolicious-Plugin-RenderFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mojolicious"

inherit rpm

SUMMARY = "'render_file' helper for Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::RenderFile is a Mojolicious plugin that adds \
'render_file' helper. It does not read file in memory and just streaming it \
to a client."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Mojolicious-Plugin-RenderFile-0.12-3.18.noarch.rpm"
RPM_HASH = "36d48ec3027aeac18b1ef3fba982829f7daaeca5e94669553f4000a5133f74d30e07febfb1cf656e80534bfcffdcb4aab0c08dd88b9f541a2d9419b6107a2807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--RenderFile \
perl-Mojolicious-Plugin-RenderFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mojolicious"

inherit rpm

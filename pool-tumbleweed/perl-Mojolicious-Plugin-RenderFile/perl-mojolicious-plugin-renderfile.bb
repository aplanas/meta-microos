SUMMARY = "'render_file' helper for Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::RenderFile is a Mojolicious plugin that adds \
'render_file' helper. It does not read file in memory and just streaming it \
to a client."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Mojolicious-Plugin-RenderFile-0.12-3.17.noarch.rpm"
RPM_HASH = "d6074d3eb28dc19e3be612c669d89a385a9ad4781a66ca811caff15c40fdadadd20da09315da7ae47681430e5fbd1ba7e2ca40c714e0640f5048ad500f360d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojolicious::Plugin::RenderFile) \
perl-Mojolicious-Plugin-RenderFile"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Mojolicious)"

inherit rpm

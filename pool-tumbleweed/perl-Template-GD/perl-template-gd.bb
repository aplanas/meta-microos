SUMMARY = "Template::GD Perl module"
DESCRIPTION = "Template::GD Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.66"

RPM_NAME = "perl-Template-GD-2.66-1.21.noarch.rpm"
RPM_HASH = "bbf13f45d14ffc103a845832e37118d91a68383e171dcff9277637319c1e699059c4e72e767e7f59b57ebe2f03543f499a9aeb64201592dd603d3a69ee3a62a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Template::Plugin::GD) \
perl(Template::Plugin::GD::Constants) \
perl(Template::Plugin::GD::Graph::area) \
perl(Template::Plugin::GD::Graph::bars) \
perl(Template::Plugin::GD::Graph::bars3d) \
perl(Template::Plugin::GD::Graph::lines) \
perl(Template::Plugin::GD::Graph::lines3d) \
perl(Template::Plugin::GD::Graph::linespoints) \
perl(Template::Plugin::GD::Graph::mixed) \
perl(Template::Plugin::GD::Graph::pie) \
perl(Template::Plugin::GD::Graph::pie3d) \
perl(Template::Plugin::GD::Graph::points) \
perl(Template::Plugin::GD::Image) \
perl(Template::Plugin::GD::Polygon) \
perl(Template::Plugin::GD::Text) \
perl(Template::Plugin::GD::Text::Align) \
perl(Template::Plugin::GD::Text::Wrap) \
perl-Template-GD"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(GD) \
perl(Template)"

inherit rpm

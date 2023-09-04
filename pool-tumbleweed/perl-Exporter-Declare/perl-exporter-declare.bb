SUMMARY = "Exporting done right"
DESCRIPTION = "Exporter::Declare is a meta-driven exporting tool. Exporter::Declare tries \
to adopt all the good features of other exporting tools, while throwing \
away horrible interfaces. Exporter::Declare also provides hooks that allow \
you to add options and arguments for import. Finally, Exporter::Declare's \
meta-driven system allows for top-notch introspection."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.114"

RPM_NAME = "perl-Exporter-Declare-0.114-1.26.noarch.rpm"
RPM_HASH = "deed2284a9e9432ce13ccd7dc9f1f4c676d7ece57635f49f30da31f5e7a528bc7b74acf2f99ea0ff306735bf6e84c81495abd544159da5967028956a873d9d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Declare \
perl-Exporter--Declare--Export \
perl-Exporter--Declare--Export--Alias \
perl-Exporter--Declare--Export--Generator \
perl-Exporter--Declare--Export--Sub \
perl-Exporter--Declare--Export--Variable \
perl-Exporter--Declare--Meta \
perl-Exporter--Declare--Specs \
perl-Exporter-Declare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Meta--Builder \
perl-aliased"

inherit rpm

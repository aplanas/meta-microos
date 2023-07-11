SUMMARY = "Exporting done right"
DESCRIPTION = "Exporter::Declare is a meta-driven exporting tool. Exporter::Declare tries \
to adopt all the good features of other exporting tools, while throwing \
away horrible interfaces. Exporter::Declare also provides hooks that allow \
you to add options and arguments for import. Finally, Exporter::Declare's \
meta-driven system allows for top-notch introspection."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.114"

RPM_NAME = "perl-Exporter-Declare-0.114-1.25.noarch.rpm"
RPM_HASH = "e610e8274dd3cf4b7a1a691ab390381fbb3cfe4aa49b82be76eb4b3bec3c1fd8272892ffdd4c7acb37049f83fe74a98447f42eb11abb80beb8db54213f4b74a8"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Meta--Builder \
perl-aliased"

inherit rpm

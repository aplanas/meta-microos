SUMMARY = "Only use Sub::Exporter if you need it"
DESCRIPTION = "Sub::Exporter is an incredibly powerful module, but with that power comes \
great responsibility, er- as well as some runtime penalties. This module is \
a 'Sub::Exporter' wrapper that will let your users just use Exporter if all \
they are doing is picking exports, but use 'Sub::Exporter' if your users \
try to use 'Sub::Exporter''s more advanced features, like renaming exports, \
if they try to use them. \
 \
Note that this module will export '@EXPORT', '@EXPORT_OK' and \
'%EXPORT_TAGS' package variables for 'Exporter' to work. Additionally, if \
your package uses advanced 'Sub::Exporter' features like currying, this \
module will only ever use 'Sub::Exporter', so you might as well use it \
directly."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001013"

RPM_NAME = "perl-Sub-Exporter-Progressive-0.001013-1.25.noarch.rpm"
RPM_HASH = "065b4437b08ba8ac8bd4742519e58cba5150ad126e89687bde5616695267a0113ca93fa6ae4ee51277b27d65b38e525a6c7ae457d8db1719335df48b30f6a36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter--Progressive \
perl-Sub-Exporter-Progressive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

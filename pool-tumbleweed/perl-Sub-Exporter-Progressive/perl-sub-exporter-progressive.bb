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

RPM_NAME = "perl-Sub-Exporter-Progressive-0.001013-1.24.noarch.rpm"
RPM_HASH = "e184fdcc73bfcc7838c797f18695507d97f1ddb49770eed07542d08aa52ca4c746fba2a43551ecd9aee9f6ac4e5e60990e41ca58fd939fdd3c590afdc6fc994c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter--Progressive \
perl-Sub-Exporter-Progressive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

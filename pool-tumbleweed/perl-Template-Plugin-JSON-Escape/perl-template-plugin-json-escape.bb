SUMMARY = "Adds a .json vmethod and a json filter"
DESCRIPTION = "This plugin allows you to embed JSON strings in HTML. In the output, \
special characters such as '<' and '&' are escaped as '\\uxxxx' to prevent \
XSS attacks. \
 \
It also provides decoding function to keep compatibility with \
Template::Plugin::JSON."
LICENSE = "MIT"

PV = "0.02"

RPM_NAME = "perl-Template-Plugin-JSON-Escape-0.02-1.12.noarch.rpm"
RPM_HASH = "fdc58d856810eb02c91d992329559fd8ae511faa903a67f457e5233e641eb8d45bab882bae7a331b62c658056ccc21de3657b615426a427b6c683ffe28a3b393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--JSON--Escape \
perl-Template-Plugin-JSON-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-JSON \
perl-Template"

inherit rpm

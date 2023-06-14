SUMMARY = "Adds a .json vmethod and a json filter"
DESCRIPTION = "This plugin allows you to embed JSON strings in HTML. In the output, \
special characters such as '<' and '&' are escaped as '\\uxxxx' to prevent \
XSS attacks. \
 \
It also provides decoding function to keep compatibility with \
Template::Plugin::JSON."
LICENSE = "MIT"

PV = "0.02"

RPM_NAME = "perl-Template-Plugin-JSON-Escape-0.02-1.11.noarch.rpm"
RPM_HASH = "06ff2e19b72b0d3a7d3af193d03013293080fc4da9f7c1baaac1c59d932f85d515fe1a220cfdf3b79b516dfa095ab8ece33697b4aaacb8d031009d3d938e1979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--JSON--Escape \
perl-Template-Plugin-JSON-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-JSON \
perl-Template"

inherit rpm

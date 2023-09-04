SUMMARY = "Adds a .json vmethod and a json filter"
DESCRIPTION = "This plugin allows you to embed JSON strings in HTML. In the output, \
special characters such as '<' and '&' are escaped as '\\uxxxx' to prevent \
XSS attacks. \
 \
It also provides decoding function to keep compatibility with \
Template::Plugin::JSON."
LICENSE = "MIT"

PV = "0.02"

RPM_NAME = "perl-Template-Plugin-JSON-Escape-0.02-1.13.noarch.rpm"
RPM_HASH = "ed583253af9e060b42ffac345c67432c7e459c0e0ad781c70a42678ce4783db37f4f9b29d154f899530fb1b73faf2a553fda789e11739bdff8521da4ac643314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--JSON--Escape \
perl-Template-Plugin-JSON-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-JSON \
perl-Template"

inherit rpm

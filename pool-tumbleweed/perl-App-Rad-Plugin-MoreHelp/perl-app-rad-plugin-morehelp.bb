SUMMARY = "App::Rad plugin for providing extra help info"
DESCRIPTION = "This is an App::Rad manpage plugin for providing extra help info. It \
provides a 'more_help' method which can be used to provide extra info that \
will be appended to to bottom of the help message."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0001"

RPM_NAME = "perl-App-Rad-Plugin-MoreHelp-0.0001-2.25.noarch.rpm"
RPM_HASH = "b2dc798085862aea1fb54da015bed7d6210e87de237cd4180a7fd0f37ef6b98b60ea7bda7ffce93733f6ba525947873c111ebe5765f80b48a0a3a85c1cefcd49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Rad--Plugin--MoreHelp \
perl-App-Rad-Plugin-MoreHelp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-App--Rad"

inherit rpm

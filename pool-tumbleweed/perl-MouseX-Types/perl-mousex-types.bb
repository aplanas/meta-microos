SUMMARY = "Organize your Mouse types in libraries"
DESCRIPTION = "Organize your Mouse types in libraries"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-MouseX-Types-0.06-11.20.noarch.rpm"
RPM_HASH = "15b497a0b1fab39354a25a251caf486936c3f747e7bbca233a6bb5147f94eb700bcdc00d8f126801c64702dc9253f313d958b0f5cc3ab74d674c8e9f739d6ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MouseX::Types) \
perl(MouseX::Types::Base) \
perl(MouseX::Types::Moose) \
perl(MouseX::Types::Mouse) \
perl(MouseX::Types::TypeDecorator) \
perl-MouseX-Types"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Any::Moose) \
perl(Mouse)"

inherit rpm

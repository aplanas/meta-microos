SUMMARY = "Easy MIME message handling"
DESCRIPTION = "This is an extension of the Email::Simple module, to handle MIME encoded \
messages. It takes a message as a string, splits it up into its constituent \
parts, and allows you access to various parts of the message. Headers are \
decoded from MIME encoding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.953"

RPM_NAME = "perl-Email-MIME-1.953-1.1.noarch.rpm"
RPM_HASH = "54ec8b085635cb71d0df184999d979c6e01cce9b7bb9950689ea0ad4e820aff503ce7849a77ae204b65b36393190518fad5853c9dae6ff6dd4ee3e32df75dda9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::MIME) \
perl(Email::MIME::Creator) \
perl(Email::MIME::Encode) \
perl(Email::MIME::Header) \
perl(Email::MIME::Header::AddressList) \
perl(Email::MIME::Modifier) \
perl-Email-MIME"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Email::Address::XS) \
perl(Email::MIME::ContentType) \
perl(Email::MIME::Encodings) \
perl(Email::MessageID) \
perl(Email::Simple) \
perl(Email::Simple::Creator) \
perl(Email::Simple::Header) \
perl(MIME::Types) \
perl(Module::Runtime) \
perl(parent)"

inherit rpm

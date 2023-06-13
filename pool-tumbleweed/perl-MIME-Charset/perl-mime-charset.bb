SUMMARY = "Charset Information for MIME"
DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.013.1"

RPM_NAME = "perl-MIME-Charset-1.013.1-1.2.noarch.rpm"
RPM_HASH = "3f3d013f289ffcf8ebb9f772ef441b31b5b9b919353febe891883f59bcf2157a59ec2131e84eaeb700610e8388244ece661d6ead9a6ba3195cc402ea5e4e3723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MIME::Charset) \
perl(MIME::Charset::UTF) \
perl(MIME::Charset::_Compat) \
perl-MIME-Charset"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

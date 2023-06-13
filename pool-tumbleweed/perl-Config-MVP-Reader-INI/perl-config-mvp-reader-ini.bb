SUMMARY = "An MVP config reader for .ini files"
DESCRIPTION = "Config::MVP::Reader::INI reads _.ini_ files containing MVP-style \
configuration."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.101465"

RPM_NAME = "perl-Config-MVP-Reader-INI-2.101465-1.2.noarch.rpm"
RPM_HASH = "40836ef695e09c887124081f88930aa13edb021e31060ee4237babaf4acfce1a1595fb4afc2c39c7e65db6c7d8dcb21da77c422de657b0aec3d768f93cb44b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::MVP::Reader::INI) \
perl-Config-MVP-Reader-INI"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Config::INI::Reader) \
perl(Config::MVP) \
perl(Config::MVP::Reader) \
perl(Config::MVP::Reader::Findable::ByExtension) \
perl(Moose) \
perl(parent)"

inherit rpm

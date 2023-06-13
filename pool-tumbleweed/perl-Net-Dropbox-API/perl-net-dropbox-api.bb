SUMMARY = "A dropbox API interface"
DESCRIPTION = "A dropbox API interface"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.9"

RPM_NAME = "perl-Net-Dropbox-API-1.9-2.18.noarch.rpm"
RPM_HASH = "47387efd9b78ccf0d164681efe95b37d1a938dddefca4deb9e9f25118b3d1fa3733569ceba8baf677f16ef0a2cf6414e1b71cae6ee1f5e8f440d7ff544c2dd0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Dropbox::API) \
perl-Net-Dropbox-API"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Random) \
perl(HTTP::Request::Common) \
perl(JSON) \
perl(LWP::UserAgent) \
perl(Mouse) \
perl(Net::OAuth) \
perl(URI) \
perl(common::sense)"

inherit rpm

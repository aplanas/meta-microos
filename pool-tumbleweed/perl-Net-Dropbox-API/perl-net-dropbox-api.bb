SUMMARY = "A dropbox API interface"
DESCRIPTION = "A dropbox API interface"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.9"

RPM_NAME = "perl-Net-Dropbox-API-1.9-2.20.noarch.rpm"
RPM_HASH = "8937e3260e5eef5d12325b1c4272b4fc83083376c27ad582be03418e6a199c19bcea37f97488953e8717b5273828539d7cc4975d04b179a48ae768d9d6c177fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Dropbox--API \
perl-Net-Dropbox-API"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Random \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--UserAgent \
perl-Mouse \
perl-Net--OAuth \
perl-URI \
perl-common--sense"

inherit rpm

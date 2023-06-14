SUMMARY = "Temporarily Set Config or Xsconfig Values"
DESCRIPTION = "temporarily set Config or XSConfig values"
LICENSE = "Artistic-2.0"

PV = "0.03"

RPM_NAME = "perl-Mock-Config-0.03-1.21.noarch.rpm"
RPM_HASH = "f7211b7540c1b7b6bb613d697f4cd1ec6b7bd36c94d0ef4570dc250fbb336741c987ad137adb99c7e07c9c3218fe248a6c4a8dfa63b85b078ce28b973d810a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mock--Config \
perl-Mock-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm

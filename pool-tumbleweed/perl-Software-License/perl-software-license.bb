SUMMARY = "Packages that provide templated software licenses"
DESCRIPTION = "packages that provide templated software licenses"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.104004"

RPM_NAME = "perl-Software-License-0.104004-1.3.noarch.rpm"
RPM_HASH = "4241f2887129f198dd5d354a05c8e78129c469ace038c8bc9da9b447b93b7ca3a448139cde42b6a69526c6c461e4409785f82ee967ab7ec56b56f44156c7bc48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Software--License \
perl-Software--License--AGPL-3 \
perl-Software--License--Apache-1-1 \
perl-Software--License--Apache-2-0 \
perl-Software--License--Artistic-1-0 \
perl-Software--License--Artistic-1-0-Perl \
perl-Software--License--Artistic-2-0 \
perl-Software--License--BSD \
perl-Software--License--CC0-1-0 \
perl-Software--License--Custom \
perl-Software--License--EUPL-1-1 \
perl-Software--License--EUPL-1-2 \
perl-Software--License--FreeBSD \
perl-Software--License--GFDL-1-2 \
perl-Software--License--GFDL-1-3 \
perl-Software--License--GPL-1 \
perl-Software--License--GPL-2 \
perl-Software--License--GPL-3 \
perl-Software--License--ISC \
perl-Software--License--LGPL-2-1 \
perl-Software--License--LGPL-3-0 \
perl-Software--License--MIT \
perl-Software--License--Mozilla-1-0 \
perl-Software--License--Mozilla-1-1 \
perl-Software--License--Mozilla-2-0 \
perl-Software--License--None \
perl-Software--License--OpenSSL \
perl-Software--License--Perl-5 \
perl-Software--License--PostgreSQL \
perl-Software--License--QPL-1-0 \
perl-Software--License--SSLeay \
perl-Software--License--Sun \
perl-Software--License--Zlib \
perl-Software--LicenseUtils \
perl-Software-License"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Section \
perl-Module--Load \
perl-Text--Template \
perl-parent"

inherit rpm

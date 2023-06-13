SUMMARY = "Packages that provide templated software licenses"
DESCRIPTION = "packages that provide templated software licenses"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.104004"

RPM_NAME = "perl-Software-License-0.104004-1.1.noarch.rpm"
RPM_HASH = "770d9e4c77fdb8026e7f2def12054a04bb347c32dd15692a1d9e58b2e1341d3445ec6a9c827fe12466eac2f687276ef33925cfcc5e95f4fbeabc9892b8629b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Software::License) \
perl(Software::License::AGPL_3) \
perl(Software::License::Apache_1_1) \
perl(Software::License::Apache_2_0) \
perl(Software::License::Artistic_1_0) \
perl(Software::License::Artistic_1_0_Perl) \
perl(Software::License::Artistic_2_0) \
perl(Software::License::BSD) \
perl(Software::License::CC0_1_0) \
perl(Software::License::Custom) \
perl(Software::License::EUPL_1_1) \
perl(Software::License::EUPL_1_2) \
perl(Software::License::FreeBSD) \
perl(Software::License::GFDL_1_2) \
perl(Software::License::GFDL_1_3) \
perl(Software::License::GPL_1) \
perl(Software::License::GPL_2) \
perl(Software::License::GPL_3) \
perl(Software::License::ISC) \
perl(Software::License::LGPL_2_1) \
perl(Software::License::LGPL_3_0) \
perl(Software::License::MIT) \
perl(Software::License::Mozilla_1_0) \
perl(Software::License::Mozilla_1_1) \
perl(Software::License::Mozilla_2_0) \
perl(Software::License::None) \
perl(Software::License::OpenSSL) \
perl(Software::License::Perl_5) \
perl(Software::License::PostgreSQL) \
perl(Software::License::QPL_1_0) \
perl(Software::License::SSLeay) \
perl(Software::License::Sun) \
perl(Software::License::Zlib) \
perl(Software::LicenseUtils) \
perl-Software-License"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Section) \
perl(Module::Load) \
perl(Text::Template) \
perl(parent)"

inherit rpm

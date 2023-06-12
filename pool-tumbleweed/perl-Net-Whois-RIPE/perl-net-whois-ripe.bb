SUMMARY = "Pure-Perl implementation of the RIPE Database client"
DESCRIPTION = "a pure-Perl implementation of the RIPE Database client."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.008001"

RPM_NAME = "perl-Net-Whois-RIPE-2.008001-1.10.noarch.rpm"
RPM_HASH = "63ee31efdc0e80f4f04ede1614d1bc603a2a1d0ca5e274d97cf35b3f61833b652ee2954e81b32f0db259e8236f53aa0f1d810888eae36fca135926da75aea52b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Whois::Generic) \
perl(Net::Whois::Object) \
perl(Net::Whois::Object::AsBlock) \
perl(Net::Whois::Object::AsBlock::AFRINIC) \
perl(Net::Whois::Object::AsBlock::APNIC) \
perl(Net::Whois::Object::AsSet) \
perl(Net::Whois::Object::AsSet::AFRINIC) \
perl(Net::Whois::Object::AsSet::APNIC) \
perl(Net::Whois::Object::AutNum) \
perl(Net::Whois::Object::AutNum::AFRINIC) \
perl(Net::Whois::Object::AutNum::APNIC) \
perl(Net::Whois::Object::Domain) \
perl(Net::Whois::Object::Domain::AFRINIC) \
perl(Net::Whois::Object::Domain::APNIC) \
perl(Net::Whois::Object::FilterSet) \
perl(Net::Whois::Object::FilterSet::AFRINIC) \
perl(Net::Whois::Object::FilterSet::APNIC) \
perl(Net::Whois::Object::Inet6Num) \
perl(Net::Whois::Object::Inet6Num::AFRINIC) \
perl(Net::Whois::Object::Inet6Num::APNIC) \
perl(Net::Whois::Object::InetNum) \
perl(Net::Whois::Object::InetNum::AFRINIC) \
perl(Net::Whois::Object::InetNum::APNIC) \
perl(Net::Whois::Object::InetRtr) \
perl(Net::Whois::Object::InetRtr::AFRINIC) \
perl(Net::Whois::Object::Information) \
perl(Net::Whois::Object::Irt) \
perl(Net::Whois::Object::Irt::AFRINIC) \
perl(Net::Whois::Object::Irt::APNIC) \
perl(Net::Whois::Object::KeyCert) \
perl(Net::Whois::Object::KeyCert::AFRINIC) \
perl(Net::Whois::Object::KeyCert::APNIC) \
perl(Net::Whois::Object::Limerick) \
perl(Net::Whois::Object::Limerick::AFRINIC) \
perl(Net::Whois::Object::Mntner) \
perl(Net::Whois::Object::Mntner::AFRINIC) \
perl(Net::Whois::Object::Mntner::APNIC) \
perl(Net::Whois::Object::Organisation) \
perl(Net::Whois::Object::Organisation::AFRINIC) \
perl(Net::Whois::Object::Organisation::APNIC) \
perl(Net::Whois::Object::PeeringSet) \
perl(Net::Whois::Object::PeeringSet::AFRINIC) \
perl(Net::Whois::Object::PeeringSet::APNIC) \
perl(Net::Whois::Object::Person) \
perl(Net::Whois::Object::Person::AFRINIC) \
perl(Net::Whois::Object::Person::APNIC) \
perl(Net::Whois::Object::Poem) \
perl(Net::Whois::Object::Poem::APNIC) \
perl(Net::Whois::Object::PoeticForm) \
perl(Net::Whois::Object::PoeticForm::APNIC) \
perl(Net::Whois::Object::Response) \
perl(Net::Whois::Object::Role) \
perl(Net::Whois::Object::Role::AFRINIC) \
perl(Net::Whois::Object::Role::APNIC) \
perl(Net::Whois::Object::Route) \
perl(Net::Whois::Object::Route6) \
perl(Net::Whois::Object::Route6::AFRINIC) \
perl(Net::Whois::Object::Route6::APNIC) \
perl(Net::Whois::Object::Route::AFRINIC) \
perl(Net::Whois::Object::Route::APNIC) \
perl(Net::Whois::Object::RouteSet) \
perl(Net::Whois::Object::RouteSet::AFRINIC) \
perl(Net::Whois::Object::RouteSet::APNIC) \
perl(Net::Whois::Object::RtrSet) \
perl(Net::Whois::Object::RtrSet::AFRINIC) \
perl(Net::Whois::Object::RtrSet::APNIC) \
perl(Net::Whois::RIPE) \
perl-Net-Whois-RIPE"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Iterator)"

inherit rpm
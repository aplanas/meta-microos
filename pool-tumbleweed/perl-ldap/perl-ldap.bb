SUMMARY = "Perl::ldap Perl module"
DESCRIPTION = "perl::ldap Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.68"

RPM_NAME = "perl-ldap-0.68-2.8.noarch.rpm"
RPM_HASH = "f1aa6027b07bf942e660b0c69b30386c6ab9f3da0e046a46242baf49a962558ade205eb76e30990dc7c7441eb11dcc1e6418286b496b34de2aeea3efba40828a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Bundle::Net::LDAP) \
perl(LWP::Protocol::ldap) \
perl(LWP::Protocol::ldapi) \
perl(LWP::Protocol::ldaps) \
perl(Net::LDAP) \
perl(Net::LDAP::ASN) \
perl(Net::LDAP::Bind) \
perl(Net::LDAP::Constant) \
perl(Net::LDAP::Control) \
perl(Net::LDAP::Control::Assertion) \
perl(Net::LDAP::Control::DontUseCopy) \
perl(Net::LDAP::Control::EntryChange) \
perl(Net::LDAP::Control::ManageDsaIT) \
perl(Net::LDAP::Control::MatchedValues) \
perl(Net::LDAP::Control::NoOp) \
perl(Net::LDAP::Control::Paged) \
perl(Net::LDAP::Control::PasswordPolicy) \
perl(Net::LDAP::Control::PersistentSearch) \
perl(Net::LDAP::Control::PostRead) \
perl(Net::LDAP::Control::PreRead) \
perl(Net::LDAP::Control::ProxyAuth) \
perl(Net::LDAP::Control::Relax) \
perl(Net::LDAP::Control::Sort) \
perl(Net::LDAP::Control::SortResult) \
perl(Net::LDAP::Control::Subentries) \
perl(Net::LDAP::Control::SyncDone) \
perl(Net::LDAP::Control::SyncRequest) \
perl(Net::LDAP::Control::SyncState) \
perl(Net::LDAP::Control::TreeDelete) \
perl(Net::LDAP::Control::VLV) \
perl(Net::LDAP::Control::VLVResponse) \
perl(Net::LDAP::DSML) \
perl(Net::LDAP::DSML::output) \
perl(Net::LDAP::DSML::pp) \
perl(Net::LDAP::Entry) \
perl(Net::LDAP::Extension) \
perl(Net::LDAP::Extension::Cancel) \
perl(Net::LDAP::Extension::Refresh) \
perl(Net::LDAP::Extension::SetPassword) \
perl(Net::LDAP::Extension::WhoAmI) \
perl(Net::LDAP::Extra) \
perl(Net::LDAP::Extra::AD) \
perl(Net::LDAP::Extra::eDirectory) \
perl(Net::LDAP::Filter) \
perl(Net::LDAP::FilterList) \
perl(Net::LDAP::FilterMatch) \
perl(Net::LDAP::Intermediate) \
perl(Net::LDAP::Intermediate::SyncInfo) \
perl(Net::LDAP::LDIF) \
perl(Net::LDAP::Message) \
perl(Net::LDAP::Message::Dummy) \
perl(Net::LDAP::Reference) \
perl(Net::LDAP::RootDSE) \
perl(Net::LDAP::Schema) \
perl(Net::LDAP::Search) \
perl(Net::LDAP::Util) \
perl(Net::LDAPI) \
perl(Net::LDAPS) \
perl-ldap"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Convert::ASN1)"

inherit rpm

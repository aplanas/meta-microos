SUMMARY = "Perl::ldap Perl module"
DESCRIPTION = "perl::ldap Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.68"

RPM_NAME = "perl-ldap-0.68-2.9.noarch.rpm"
RPM_HASH = "8c829524db753443564386f83fae39c5eb3d76066f04bd7319d90db97acfe1084232f36aae0571fa7197ca451e24cf3b7d3f3848c8db359cb454c7fa6e619df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Bundle--Net--LDAP \
perl-LWP--Protocol--ldap \
perl-LWP--Protocol--ldapi \
perl-LWP--Protocol--ldaps \
perl-Net--LDAP \
perl-Net--LDAP--ASN \
perl-Net--LDAP--Bind \
perl-Net--LDAP--Constant \
perl-Net--LDAP--Control \
perl-Net--LDAP--Control--Assertion \
perl-Net--LDAP--Control--DontUseCopy \
perl-Net--LDAP--Control--EntryChange \
perl-Net--LDAP--Control--ManageDsaIT \
perl-Net--LDAP--Control--MatchedValues \
perl-Net--LDAP--Control--NoOp \
perl-Net--LDAP--Control--Paged \
perl-Net--LDAP--Control--PasswordPolicy \
perl-Net--LDAP--Control--PersistentSearch \
perl-Net--LDAP--Control--PostRead \
perl-Net--LDAP--Control--PreRead \
perl-Net--LDAP--Control--ProxyAuth \
perl-Net--LDAP--Control--Relax \
perl-Net--LDAP--Control--Sort \
perl-Net--LDAP--Control--SortResult \
perl-Net--LDAP--Control--Subentries \
perl-Net--LDAP--Control--SyncDone \
perl-Net--LDAP--Control--SyncRequest \
perl-Net--LDAP--Control--SyncState \
perl-Net--LDAP--Control--TreeDelete \
perl-Net--LDAP--Control--VLV \
perl-Net--LDAP--Control--VLVResponse \
perl-Net--LDAP--DSML \
perl-Net--LDAP--DSML--output \
perl-Net--LDAP--DSML--pp \
perl-Net--LDAP--Entry \
perl-Net--LDAP--Extension \
perl-Net--LDAP--Extension--Cancel \
perl-Net--LDAP--Extension--Refresh \
perl-Net--LDAP--Extension--SetPassword \
perl-Net--LDAP--Extension--WhoAmI \
perl-Net--LDAP--Extra \
perl-Net--LDAP--Extra--AD \
perl-Net--LDAP--Extra--eDirectory \
perl-Net--LDAP--Filter \
perl-Net--LDAP--FilterList \
perl-Net--LDAP--FilterMatch \
perl-Net--LDAP--Intermediate \
perl-Net--LDAP--Intermediate--SyncInfo \
perl-Net--LDAP--LDIF \
perl-Net--LDAP--Message \
perl-Net--LDAP--Message--Dummy \
perl-Net--LDAP--Reference \
perl-Net--LDAP--RootDSE \
perl-Net--LDAP--Schema \
perl-Net--LDAP--Search \
perl-Net--LDAP--Util \
perl-Net--LDAPI \
perl-Net--LDAPS \
perl-ldap"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Convert--ASN1"

inherit rpm

SUMMARY = "YaST2 - Samba Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for configuration of an SMB \
workgroup/domain and authentication against an SMB domain."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-samba-client-4.6.1-1.1.noarch.rpm"
RPM_HASH = "d0c88204333ec05124b84848ba42023fedb841b6e417695b55c7928018d260e3766cd7fa4aaa737e4ae1c4243905c6a38eacd058babd92c38a72e5d5d868a747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.SambaClient.desktop) \
metainfo() \
metainfo(org.opensuse.yast.SambaClient.metainfo.xml) \
perl(SambaAD) \
perl(SambaConfig) \
perl(SambaNetJoin) \
perl(SambaNmbLookup) \
perl(SambaWinbind) \
yast2-samba-client"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-XML-LibXML \
yast2 \
yast2-network \
yast2-pam \
yast2-python3-bindings \
yast2-ruby-bindings"

inherit rpm

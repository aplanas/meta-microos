SUMMARY = "Directory Server (LDAP)"
DESCRIPTION = "Software to set up a directory server with OpenLDAP. The Lightweight Directory Access Protocol (LDAP) is used to access online directory services."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-directory_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "75f62cc846203b9084cc35c496b9f54b976b4e94076cae37d5612ce0a240533ea528ea9510eccb87cfb95db99048c41a4aa2b358f99ad3cac12436ff14d7ef74"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-openSUSE-directory_server \
patterns-server-directory_server \
patterns-server-directory_server(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
